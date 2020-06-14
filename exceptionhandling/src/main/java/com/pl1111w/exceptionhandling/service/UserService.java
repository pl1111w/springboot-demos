package com.pl1111w.exceptionhandling.service;

import com.pl1111w.exceptionhandling.entity.User;

public interface UserService {
    /**
     *
     * @param user 用户对象
     * @return 成功则返回"success"，失败则返回错误信息
     */
    String addUser(User user);
}
