package com.cl.happy.common.cache.fallback;

import com.cl.happy.common.cache.CacheService;
import org.springframework.stereotype.Component;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */
@Component
public class CacheFallback implements CacheService {
    @Override
    public String get(String key) {
        return "失败降级，快速返回";
    }

    @Override
    public String set(String key, String value) {
        return "失败降级，快速返回";
    }
}
