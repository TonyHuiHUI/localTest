package com.hui.demo.redis.redisson;

/**
 * @author hui
 * 2021/5/14 0014 11:28
 */
public interface LockWorker<T> {
    T invokerAfterAquireLock();
}
