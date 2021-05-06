import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class FizzBuzz {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    private static CyclicBarrier barrier = new CyclicBarrier(4);

    public void fizz() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("fizz");
            }
            try {
//                System.out.println("fizz: "+barrier.getNumberWaiting());
                barrier.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public void buzz() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("buzz");
            }
            try {
//                System.out.println("buzz: "+barrier.getNumberWaiting());
                barrier.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public void fizzbuzz() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            try {
//                System.out.println("fizzbuzz: " + barrier.getNumberWaiting());
                barrier.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public void number() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
            try {
//                System.out.println("number: "+ barrier.getNumberWaiting());
                barrier.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fizzBuzz.fizz();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    fizzBuzz.buzz();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    fizzBuzz.fizzbuzz();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    fizzBuzz.number();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
