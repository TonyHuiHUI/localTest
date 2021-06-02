import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {
    //5把叉子，5把锁
    ReentrantLock[] reentrantLocks = {
            new ReentrantLock(),
            new ReentrantLock(),
            new ReentrantLock(),
            new ReentrantLock(),
            new ReentrantLock(),
    };
    //最多允许4名哲学家进餐，防止死锁
    Semaphore semaphore = new Semaphore(4);

    public DiningPhilosophers() {

    }

    // call the run() method of any runnable to execute its code
    public void wantsToEat(int philosopher,
                           Runnable pickLeftFork,
                           Runnable pickRightFork,
                           Runnable eat,
                           Runnable putLeftFork,
                           Runnable putRightFork) throws InterruptedException {
        int rightFork = philosopher;
        int leftFork = (philosopher + 1) % 5;
        semaphore.acquire();
        reentrantLocks[rightFork].lock();
        reentrantLocks[leftFork].lock();
        pickLeftFork.run();
        pickRightFork.run();
        eat.run();
        putLeftFork.run();
        putRightFork.run();
        reentrantLocks[rightFork].unlock();
        reentrantLocks[leftFork].unlock();
        semaphore.release();
    }
}
