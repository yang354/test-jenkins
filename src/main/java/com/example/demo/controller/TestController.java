package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author yzz
 * @Date 2023/8/21 下午1:56
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("hello")
    @ResponseBody
    public String  getTest(){
        return "Hello World ,This is  Test";
    }
}
