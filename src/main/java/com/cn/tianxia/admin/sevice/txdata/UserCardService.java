package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserCard;

public interface UserCardService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserCard record);

    UserCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCard record);
}
