package com.fegin.controller;

import com.fegin.service.OrderFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName FeginControlller
 * @Description TODO
 * @Author liangjy
 * Data 2018/12/10 15:34
 */
@RestController
public class FeginControlller {
    @Autowired
    private OrderFeginService orderFeginService;

    @RequestMapping("/getOrderMemberByFegin")
    public List<String> getOrderFeginMemberList() {
        return orderFeginService.getOrderFeginMemberList();
    }
}
