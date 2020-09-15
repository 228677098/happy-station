package com.cl.happy.cache.service;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */
public interface CacheService {
    String get(String key);

    void set(String key, String value);
}
