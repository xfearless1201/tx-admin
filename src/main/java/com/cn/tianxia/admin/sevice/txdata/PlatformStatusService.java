package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PlatformStatus;

public interface PlatformStatusService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PlatformStatus record);

    PlatformStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlatformStatus record);
}
