package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.BackWaterConfig;

public interface BackWaterConfigService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(BackWaterConfig record);

    BackWaterConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BackWaterConfig record);
}
