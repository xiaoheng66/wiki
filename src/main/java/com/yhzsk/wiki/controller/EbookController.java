package com.yhzsk.wiki.controller;

import com.yhzsk.wiki.domain.Demo;
import com.yhzsk.wiki.domain.Ebook;
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
    public List<Ebook> list()
    {
        return ebookservice.list();
    }






}
