package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserMember;

public interface UserMemberService {

    int deleteByPrimaryKey(Integer uid);

    int insertSelective(UserMember record);

    UserMember selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserMember record);
}
