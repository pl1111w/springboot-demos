package com.pl1111w.mybatisdemo.service.impl;

import com.pl1111w.mybatisdemo.entity.UserInfo;
import com.pl1111w.mybatisdemo.entity.UserInfoExample;
import com.pl1111w.mybatisdemo.mapper.UserInfoMapper;
import com.pl1111w.mybatisdemo.service.IUesrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements IUesrInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public long countByExample(UserInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserInfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(UserInfo record) {
        return userInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(UserInfo record) {
        return 0;
    }

    @Override
    public List<UserInfo> selectByExample(UserInfoExample example) {
        return null;
    }

    @Override
    public UserInfo selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UserInfo record, UserInfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UserInfo record, UserInfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return 0;
    }
}
