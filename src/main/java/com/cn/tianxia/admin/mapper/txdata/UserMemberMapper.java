package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserMember;

public interface UserMemberMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UserMember record);

    int insertSelective(UserMember record);

    UserMember selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserMember record);

    int updateByPrimaryKey(UserMember record);
}