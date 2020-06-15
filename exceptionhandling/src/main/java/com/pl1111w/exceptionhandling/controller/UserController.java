package com.pl1111w.exceptionhandling.controller;

import com.pl1111w.exceptionhandling.entity.User;
import com.pl1111w.exceptionhandling.exception.APIException;
import com.pl1111w.exceptionhandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody @Valid User user) {
        if(true){
            throw new APIException(400, "这是400错误");
        }
        return userService.addUser(user);
    }

    @GetMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setAccount("12345678");
        user.setPassword("12345678");
        user.setEmail("123@qq.com");
        return user;
    }

}
