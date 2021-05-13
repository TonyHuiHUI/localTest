package com.hui.demo.redis.configuration;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hui
 * 2021/5/13 0013 17:56
 */
@Configuration
public class RedissonConfig {
    @Bean
    RedissonClient redisson(){
        return Redisson.create();
    }
}
