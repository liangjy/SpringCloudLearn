package com.eureka.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName OrderApp
 * @Description TODO
 * @Author liangjy
 * Data 2018/11/27 15:05
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderApp {
    public static void main(String args[]){
        SpringApplication.run(OrderApp.class,args);
    }
}
