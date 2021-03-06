package com.pl1111w.mybatisdemo.mapper;

import com.pl1111w.mybatisdemo.entity.UserInfo;
import com.pl1111w.mybatisdemo.entity.UserInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserInfoMapper {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    @Select("SELECT * FROM USER_INFO WHERE PHONE = #{phone}")
    UserInfo selectUserInfoByPhone(@Param("phone") Integer phone);

}