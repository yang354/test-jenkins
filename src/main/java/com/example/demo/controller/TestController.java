package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author yzz
 * @Date 2023/8/21 下午1:56
 */

@Slf4j
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("hello")
    @ResponseBody
    public String  getTest(){
        log.info("打印日志");
        return "Hello World ,This is  Test";
    }
}
