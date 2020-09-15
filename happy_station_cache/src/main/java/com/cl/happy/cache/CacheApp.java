package com.cl.happy.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */
@SpringBootApplication
@EnableEurekaClient
public class CacheApp {
    public static void main(String[] args){
        SpringApplication.run(CacheApp.class,args);
    }
}
