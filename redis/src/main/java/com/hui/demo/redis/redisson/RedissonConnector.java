package com.hui.demo.redis.redisson;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hui
 * 2021/5/14 0014 11:38
 */
@Component
public class RedissonConnector {

    @Autowired
    private RedissonClient redissonClient;
    public RedissonClient getRedissonClient(){
        return redissonClient;
    }
}
