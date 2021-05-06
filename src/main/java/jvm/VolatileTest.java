package jvm;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

/**
 * volatile变量自增运算测试
 * @author hui
 * 2021/1/15 0015 17:41
 */
public class VolatileTest {
    public static volatile int race = 0;
    public static void  increase(){
        race++;
    }
    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i< THREADS_COUNT;i++){
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i< 10000;i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        /**
         * Monitor Ctrl-Break这个线程只会在IDEA中被打印出来
         * 在IDEA中通过debug启动的不会出现，只有run启动的会出现
         * 所以在idea中执行run的时候这个要写成2而不能是1在eclipse
         * 中却不会出现这个问题，这是软件引起的在开发调试过程要注意。
         */
        while (Thread.activeCount() > 2){
//            Thread[] tarray = new Thread[Thread.activeCount()];
//            int count = Thread.enumerate(tarray);
//
//            // prints active threads
//            for (int i = 0; i < count; i++)
//                System.out.println(tarray[i].getName() + " found");

            Thread.yield();
        }
        System.out.println(race);
    }
}
