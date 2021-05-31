import java.util.concurrent.Semaphore;

public class ZeroEvenOdd {
    private int n;
    private Semaphore zeroSemaphore = new Semaphore(1);
    private Semaphore evenSemaphore = new Semaphore(0);
    private Semaphore oddSemaphore = new Semaphore(0);


    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(int printNumber) throws InterruptedException {
        for (int i = 0; i < printNumber; i++) {
            zeroSemaphore.acquire();
            System.out.println(0);
            if (i % 2 == 0) {
                oddSemaphore.release();
            } else {
                evenSemaphore.release();
            }
        }

    }

    public void even(int printNumber) throws InterruptedException {
        for (int i = 2; i <= printNumber; i += 2) {
            evenSemaphore.acquire();
            System.out.println(i);
            zeroSemaphore.release();
        }
    }

    public void odd(int printNumber) throws InterruptedException {
        for (int i = 1; i <= printNumber; i += 2) {
            oddSemaphore.acquire();
            System.out.println(i);
            zeroSemaphore.release();
        }
    }

    public static void main(String[] args) {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(100);
        new Thread(() -> {
            try {
                zeroEvenOdd.zero(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                zeroEvenOdd.even(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                zeroEvenOdd.odd(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
