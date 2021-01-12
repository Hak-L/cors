package com.sgl.corstwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description:
 * @Author: sgl
 * @Date: 2020/12/8 0008 下午 19:18
 */
@RestController
@RequestMapping("cors")
public class HelloCors {

    @RequestMapping("/cors_test")
    @GetMapping
    public String corsTest(){
        return "hello cors";
    }

}
