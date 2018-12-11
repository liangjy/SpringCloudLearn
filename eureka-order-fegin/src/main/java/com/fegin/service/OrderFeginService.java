package com.fegin.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "eureka-member")
public interface OrderFeginService {
    @RequestMapping("/getAllMember")//这里需要和对应的服务url对应，否则会出现找不到异常
    public List<String> getOrderFeginMemberList();
}
