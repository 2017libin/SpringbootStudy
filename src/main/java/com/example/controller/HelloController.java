package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author subeiLY
 * @create 2021-10-21 18:23
 */
@RestController
public class HelloController {
    @RequestMapping("/hello1")
    public String hello() {
        return "hello,SpringBoot!";
    }
}