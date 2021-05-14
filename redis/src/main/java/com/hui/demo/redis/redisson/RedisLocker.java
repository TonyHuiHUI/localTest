package com.hui.demo.redis.redisson;


import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author hui
 * 2021/5/14 0014 11:33
 */
@Component
public class RedisLocker implements DistributeLocker {
    private final static String LOCLER_PRERFIX = "lock:";
    @Autowired
    RedissonConnector redissonConnector;
    @Override
    public <T> T lock(String resourceKey, LockWorker<T> worker) {
        return lock(resourceKey, worker, 100);
    }

    @Override
    public <T> T lock(String resourceKey, LockWorker<T> worker, int expireTime) {
        RedissonClient redissonClient = redissonConnector.getRedissonClient();
        RLock lock = redissonClient.getLock(LOCLER_PRERFIX + resourceKey);
        try {
            boolean success = lock.tryLock(100, expireTime, TimeUnit.SECONDS);
            if(success){
                return worker.invokerAfterAquireLock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return null;
    }
}
