package com.pl1111w.mybatisdemo.service;

import com.pl1111w.mybatisdemo.entity.UserInfo;
import com.pl1111w.mybatisdemo.entity.UserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUesrInfoService {

    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer id);

    UserInfo selectUserInfoByPhone(Integer phone);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
