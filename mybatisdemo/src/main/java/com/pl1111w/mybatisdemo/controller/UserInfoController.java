package com.pl1111w.mybatisdemo.controller;

import com.pl1111w.mybatisdemo.entity.UserInfo;
import com.pl1111w.mybatisdemo.service.IUesrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/queryUserInfoByPhone")
    UserInfo selectUserInfoByPhone(@RequestParam("phone") Integer phone){
        UserInfo userInfo = userInfoService.selectUserInfoByPhone(phone);
        return userInfo;
    }
}
