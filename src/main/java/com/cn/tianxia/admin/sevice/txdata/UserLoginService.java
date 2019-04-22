package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserLogin;

public interface UserLoginService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLogin record);
}
