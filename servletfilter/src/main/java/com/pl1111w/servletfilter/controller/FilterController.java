package com.pl1111w.servletfilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {

    @GetMapping(value = "/api/filter")
    public String apiFilter(String username){

        return "api";
    }
}
