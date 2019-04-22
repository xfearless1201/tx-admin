package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PsAuth;

public interface PsAuthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PsAuth record);

    int insertSelective(PsAuth record);

    PsAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PsAuth record);

    int updateByPrimaryKey(PsAuth record);
}