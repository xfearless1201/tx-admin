package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserCard;

public interface UserCardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCard record);

    int insertSelective(UserCard record);

    UserCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCard record);

    int updateByPrimaryKey(UserCard record);
}