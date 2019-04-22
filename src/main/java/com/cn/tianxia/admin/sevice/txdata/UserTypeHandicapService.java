package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserTypeHandicap;

public interface UserTypeHandicapService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserTypeHandicap record);

    UserTypeHandicap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTypeHandicap record);
}
