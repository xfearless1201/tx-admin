package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PlatformLogin;

public interface PlatformLoginService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PlatformLogin record);

    PlatformLogin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlatformLogin record);

}
