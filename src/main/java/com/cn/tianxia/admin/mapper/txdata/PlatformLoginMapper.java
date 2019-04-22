package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PlatformLogin;

public interface PlatformLoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlatformLogin record);

    int insertSelective(PlatformLogin record);

    PlatformLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlatformLogin record);

    int updateByPrimaryKey(PlatformLogin record);
}