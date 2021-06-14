package com.pl1111w.schduleasync.controller;

import com.pl1111w.schduleasync.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/hello")
    public String hello() {

        asyncService.hello();
        System.out.println("hello");
        return "success";
    }
}
