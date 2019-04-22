package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.BackWaterConfig;

public interface BackWaterConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BackWaterConfig record);

    int insertSelective(BackWaterConfig record);

    BackWaterConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BackWaterConfig record);

    int updateByPrimaryKey(BackWaterConfig record);
}