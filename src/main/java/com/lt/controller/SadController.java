package com.lt.controller;

import com.lt.mapper.sadMapper;
import com.lt.pojo.TooSad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SadController {
    @Autowired
    private sadMapper sadMapper;
    @RequestMapping("/add")
    boolean add(TooSad tooSad){
        boolean b = sadMapper.addSad(tooSad);
        return b;
    }
    @RequestMapping("/query0")
    List<TooSad> find(){
        List<TooSad> tooSads = sadMapper.query0();
        return tooSads;
    }
}
