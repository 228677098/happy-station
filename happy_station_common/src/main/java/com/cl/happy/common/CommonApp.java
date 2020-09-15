package com.cl.happy.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CommonApp {
    public static void main(String[] args){
        SpringApplication.run(CommonApp.class, args);
    }
}
