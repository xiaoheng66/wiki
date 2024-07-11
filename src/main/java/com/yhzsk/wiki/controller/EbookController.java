package com.yhzsk.wiki.controller;

import com.yhzsk.wiki.domain.Demo;
import com.yhzsk.wiki.domain.Ebook;
import com.yhzsk.wiki.resp.CommonResp;
import com.yhzsk.wiki.service.Demoservice;
import com.yhzsk.wiki.service.Ebookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Autowired
    private Ebookservice ebookservice;



    @GetMapping("/list")
    public CommonResp list()
    {
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookservice.list();
        //success的值默认写了true  所以就不用再单独设置了
        resp.setContent(list);
        return resp;
    }






}
