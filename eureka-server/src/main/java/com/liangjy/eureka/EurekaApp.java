package com.liangjy.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaApp
 * @Description TODO
 * @Author liangjy
 * Data 2018/11/27 10:33
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
    public static void main(String args[]){
        new SpringApplicationBuilder(EurekaApp.class).web(true).run(args);
    }
}
