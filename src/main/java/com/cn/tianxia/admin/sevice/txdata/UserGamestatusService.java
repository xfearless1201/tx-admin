package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserGamestatus;

public interface UserGamestatusService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserGamestatus record);

    UserGamestatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserGamestatus record);
}
