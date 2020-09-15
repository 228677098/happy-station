package com.cl.happy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {

    public static void main(String[] args){
        SpringApplication.run(EurekaApp.class,args);
    }
}
