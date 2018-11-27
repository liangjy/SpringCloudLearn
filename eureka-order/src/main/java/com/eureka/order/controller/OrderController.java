package com.eureka.order.controller;

import com.eureka.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author liangjy
 * Data 2018/11/27 14:59
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrderUserAll")
    public List<String> getOrderUserAll() {
        return orderService.getOrderUser();
    }
}
