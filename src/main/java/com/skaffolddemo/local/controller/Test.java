package com.skaffolddemo.local.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Test {
    @Autowired

    @RequestMapping("/hello")
    public String test(){
        log.info("Thread Name:{}", Thread.currentThread().getName());
        return "Hello!";
    }
}
