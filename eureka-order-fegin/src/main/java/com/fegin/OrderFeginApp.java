package com.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @ClassName OrderFeginApp
 * @Description TODO
 * @Author liangjy
 * Data 2018/12/10 15:36
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderFeginApp {
    public static void main(String args[]) {
        SpringApplication.run(OrderFeginApp.class, args);
    }
}
