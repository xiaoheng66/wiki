package com.yhzsk.wiki.service;

import com.yhzsk.wiki.domain.Ebook;
import com.yhzsk.wiki.domain.EbookExample;
import com.yhzsk.wiki.mapper.EbookMapper;
import com.yhzsk.wiki.req.EbookReq;
import com.yhzsk.wiki.resp.EbookResp;
import com.yhzsk.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Ebookservice {


    @Autowired
    private EbookMapper ebookMapper;


    public List<EbookResp> list(EbookReq req){
        //创建一个EbookExample的对象
        EbookExample ebookExample = new EbookExample();
        //调用createCriteria方法  创建一个Criteria的对象  这个Criteria是EbookExample的一个内部类
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");

        // 原本是直接return 现在改造成这样  用一个Ebook集合来接收
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
       /*
        //创建一个EbookResp集合
        List<EbookResp> respList = new ArrayList<>();
        //在循环中把第一个集合中的转化到第二个  实现实体类的复制
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            //ebookResp.setId(ebook.getId());  这样写要把所有的属性都来一遍  比较繁琐
            //所以直接用工具类  一句就能实现对象的复制
            BeanUtils.copyProperties(ebook,ebookResp);
            respList.add(ebookResp);
        }

        return respList;
        */

        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;
    }
}
