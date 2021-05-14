package com.hui.demo.redis.redisson;

/**
 * @author hui
 * 2021/5/14 0014 11:16
 */
public interface DistributeLocker {
    <T> T lock(String resourceKey, LockWorker<T> worker);
    <T> T lock(String resourceKey, LockWorker<T> worker, int expireTime);
}
