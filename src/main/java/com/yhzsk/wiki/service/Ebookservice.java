package com.yhzsk.wiki.service;

import com.yhzsk.wiki.domain.Ebook;
import com.yhzsk.wiki.mapper.EbookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ebookservice {


    @Autowired
    private EbookMapper ebookMapper;


    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
