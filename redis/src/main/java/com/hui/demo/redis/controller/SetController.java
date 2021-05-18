package com.hui.demo.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.PDLOverrideSupported;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api/set")
public class SetController {
    @Autowired
    private StringRedisTemplate redisTemplate;
    private AtomicInteger successNum = new AtomicInteger(0);

    @RequestMapping(value = "/initSku", method = RequestMethod.GET)
    public String initSku(){
        redisTemplate.opsForZSet().add("product","1",5);
        successNum.set(0);
        return "初始化库存成功";
    }

    @RequestMapping(value = "/reduceSku", method = RequestMethod.GET)
    public String reduceSku5(String pid){
        pid = pid == null ? String.valueOf(1): pid;
        String finalPid = pid;
        List<Object> results = redisTemplate.execute(new SessionCallback<List<Object>>() {
            @Override
            public List<Object> execute(RedisOperations redisOperations) throws DataAccessException {
                String key = "product";
                redisOperations.watch(key);
                ZSetOperations zSetOperations = redisOperations.opsForZSet();
                Object score = zSetOperations.score(key, finalPid);
                redisOperations.multi();
                if(score != null && Double.valueOf(score.toString()) >0){
                    zSetOperations.incrementScore("product", finalPid, -1);
                }
                return redisOperations.exec();
            }
        });
        if(results != null && results.size() > 0){
            return "减少库存成功，共减少" +  successNum.incrementAndGet();
        }
        return "库存不足";
    }

    @RequestMapping(value = "/successNum", method = RequestMethod.GET)
    public String successNum(){
        return "顾客成功抢到的商品数量："+ successNum.get();
    }
}
