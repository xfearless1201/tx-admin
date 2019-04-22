package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserGamestatus;

public interface UserGamestatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserGamestatus record);

    int insertSelective(UserGamestatus record);

    UserGamestatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserGamestatus record);

    int updateByPrimaryKey(UserGamestatus record);
}