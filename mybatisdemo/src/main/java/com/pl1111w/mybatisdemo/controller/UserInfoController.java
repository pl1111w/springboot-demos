package com.pl1111w.mybatisdemo.controller;

import com.pl1111w.mybatisdemo.entity.UserInfo;
import com.pl1111w.mybatisdemo.service.IUesrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("UserInfo")
public class UserInfoController {

    @Autowired
    private IUesrInfoService userInfoService;

    @PostMapping("/save")
    public int saveUserInfo(@RequestBody UserInfo userInfo){
        System.out.println("开始保存用户信息.....");
        return userInfoService.insert(userInfo);
    }
}
