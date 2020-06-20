package com.pl1111w.servletfilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {

    @GetMapping(value = "/traditional")
    public String apiFilter(String username) {

        return "apiFilter";
    }

    @GetMapping(value = "/servlets")
    public String apiServlet() {
        System.out.println("====");
        return "apiServlet";
    }
}
