package com.cl.happy.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApp {
    public static void main(String[] args){
        SpringApplication.run(ZuulApp.class,args);
    }
}
