package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserTypeHandicap;

public interface UserTypeHandicapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserTypeHandicap record);

    int insertSelective(UserTypeHandicap record);

    UserTypeHandicap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTypeHandicap record);

    int updateByPrimaryKey(UserTypeHandicap record);
}