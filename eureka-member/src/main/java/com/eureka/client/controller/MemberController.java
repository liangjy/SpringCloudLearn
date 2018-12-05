package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MemberController
 * @Description TODO
 * @Author liangjy
 * Data 2018/11/27 11:00
 */
@RestController
public class MemberController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/getAllMember")
    public List<String> getAllMember(){
        List<String> listUser = new ArrayList<String>();
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("wangwu");
        listUser.add("serverPort:"+serverPort);
        return listUser;
    }

    @RequestMapping("/getMemberService")
    public String getMemberService(){
        return "this is 会员服务";
    }

}
