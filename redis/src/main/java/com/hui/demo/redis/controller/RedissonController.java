package com.hui.demo.redis.controller;

import com.hui.demo.redis.redisson.LockWorker;
import com.hui.demo.redis.redisson.RedisLocker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

@RestController
public class RedissonController {
    @Autowired
    RedisLocker distributedLocker;

    @RequestMapping(value = "/redLock")
    public String testRedLock() throws InterruptedException {
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSingnal = new CountDownLatch(5);
        for (int i = 0; i < 5; i++){
            new Thread(new Worker(startSignal, doneSingnal)).start();
        }
        startSignal.countDown();
        doneSingnal.await();
        System.out.println("all processors done. shutdown connection");
        return "redLock";
    }
    class Worker implements Runnable{

        private final CountDownLatch startSignal;
        private final CountDownLatch doneSignal;

        Worker(CountDownLatch startSignal, CountDownLatch doneSingnal){
            this.startSignal = startSignal;
            this.doneSignal = doneSingnal;
        }

        @Override
        public void run() {
            try {
                startSignal.await();
                distributedLocker.lock("test", new LockWorker<Object>() {
                    @Override
                    public Object invokerAfterAquireLock() {
                        doTask();
                        return null;
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        void  doTask(){
            System.out.println(Thread.currentThread().getName() + " start");
            Random random = new Random();
            int sleepTime = random.nextInt(200);
            System.out.println(Thread.currentThread().getName() + " sleep " + sleepTime + "millis");
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end");
            doneSignal.countDown();
        }

    }
}
