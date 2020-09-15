package com.cl.happy.common.controller;

import com.cl.happy.common.cache.CacheService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private CacheService cacheService;

    @GetMapping("/test/{id}")
    public String test(@PathVariable String id){

        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return id;
    }
    @GetMapping("/user")
    public String test2(){

        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "hello world!";
    }

    @GetMapping("/search/{key}")
    public String search(@PathVariable String key){

        String result = cacheService.get(key);
        return result;
    }

    @PostMapping("/set")
    public String set(@RequestParam(value = "key") String key,@RequestParam(value = "value") String value){

        String result = cacheService.set(key,value);
        return result;
    }
}
