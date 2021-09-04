package com.cl.happy.cache.controller;

import com.cl.happy.cache.service.CacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */
@RestController
@RequestMapping("/cache")
@Slf4j
public class CacheController {

    @Resource
    private CacheService cacheService;

    /**
     * 获取字符串类型的value
     * @param key
     * @return
     */
    @GetMapping("/get/{key}")
    public String get(@PathVariable String key){
        log.info("【cache模块get执行了 key={}】", key);
        return  cacheService.get(key);
    }

    /**
     * 存入字符串类型的value
     * @param key
     * @return
     */
    @PostMapping("/set")
    public String set(@RequestParam String key,@RequestParam String value){
        log.info("【cache模块set执行了 key={},value={}】", key,value);
        System.out.println("aaa");
        cacheService.set(key,value);
        return null;
    }
}
