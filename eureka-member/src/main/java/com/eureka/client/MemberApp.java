package com.eureka.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName MemberApp
 * @Description TODO
 * @Author liangjy
 * Data 2018/11/27 11:02
 */
@SpringBootApplication
@EnableEurekaClient
public class MemberApp {
    public static void main(String args[]){
        new SpringApplicationBuilder(MemberApp.class).web(true).run(args);
    }
}
