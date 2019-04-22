package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PsAuth;

public interface PsAuthService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PsAuth record);

    PsAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PsAuth record);
}
