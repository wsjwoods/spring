package com.woods.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wushijian
 * @Date: 2020/5/28 16:40
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello world:" + name;
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return "hello world";
    }

    @RequestMapping("/hello3")
    public String hello3() {
        return "hello world3";
    }
}
