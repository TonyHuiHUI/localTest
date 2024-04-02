package jvm;

public class TestLock {

    /**
     * 造成死锁的原因是 Integer.valueOf()方法基于减少对象创建次数和节省内存的考虑，[-128;127]之间的数字会被缓存.
     * 当valueOf().方法传入参数在这个范围之内，将直接返回缓存中的对象。也就是说，代码中调用了200次 Integer.valueOf(方法一共就只返回了两个不同的对象。
     * 假如在某个线程的两个synchronized块之间发生了一次线程切换,那就会出现线程A等着被线程B,持有的: Integer,valueof(1)， 线程B义等着被线程A持有的Integer.valueOf(2);
     * 结果出现大家;都跑不下去的情景
     */

    static class SynAddRunable implements Runnable {
        int a, b;

        public SynAddRunable(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (Integer.valueOf(a)) {
                synchronized (Integer.valueOf(b)) {
                    System.out.println(a + b);
                }
            }
        }
    }
    public static void main (String[]args){
                for (int i = 0; i < 100; i++) {
                    new Thread(new SynAddRunable(1, 2)).start();
                    new Thread(new SynAddRunable(2, 1)).start();
                }
            }
}
