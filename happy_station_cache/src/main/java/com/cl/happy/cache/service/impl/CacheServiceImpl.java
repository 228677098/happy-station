package com.cl.happy.cache.service.impl;

import com.cl.happy.cache.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */
@Service
public class CacheServiceImpl implements CacheService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public String get(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }

    @Override
    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }
}
