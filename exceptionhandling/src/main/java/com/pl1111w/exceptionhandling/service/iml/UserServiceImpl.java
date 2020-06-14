package com.pl1111w.exceptionhandling.service.iml;

import com.pl1111w.exceptionhandling.entity.User;
import com.pl1111w.exceptionhandling.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {
        // 直接编写业务逻辑
        return "success";
    }
}

