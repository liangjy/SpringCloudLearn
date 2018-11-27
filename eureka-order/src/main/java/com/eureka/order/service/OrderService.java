package com.eureka.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author liangjy
 * Data 2018/11/27 15:00
 */
@Service
public class OrderService {
    @Autowired
    private RestTemplate restTemplate;

    public List<String> getOrderUser() {
        return restTemplate.getForObject("http://eureka-member/getAllMember", List.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
