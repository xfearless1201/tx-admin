package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PlatformConfig;

public interface PlatformConfigService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PlatformConfig record);

    PlatformConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlatformConfig record);

}
