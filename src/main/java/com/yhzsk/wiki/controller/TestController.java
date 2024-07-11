package com.yhzsk.wiki.controller;

import com.yhzsk.wiki.domain.test;
import com.yhzsk.wiki.service.testservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private testservice ts;

    @Value("${test.hello:tt2}")
    private String testHello;
    @RequestMapping("/hello")
    public String hello(){
        return "Hello!!!" + testHello;
    }


    @GetMapping("/test/list")
    public List<test> list()
    {
        return ts.list();
    }






}
