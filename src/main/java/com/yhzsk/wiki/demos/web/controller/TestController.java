package com.yhzsk.wiki.demos.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello:tt2}")
    private String testHello;
    @RequestMapping("/hello")
    public String hello(){
        return "Hello!!!" + testHello;
    }



}
