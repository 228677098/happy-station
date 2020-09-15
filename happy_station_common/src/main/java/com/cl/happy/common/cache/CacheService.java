package com.cl.happy.common.cache;

import com.cl.happy.common.cache.fallback.CacheFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */

@FeignClient(value = "cache",fallback = CacheFallback.class)
public interface CacheService {
    @GetMapping("cache/get/{key}")
    String get(@PathVariable(value = "key") String key);

    @PostMapping("cache/set")
    public String set(@RequestParam(value = "key") String key,@RequestParam(value = "value") String value);
}
