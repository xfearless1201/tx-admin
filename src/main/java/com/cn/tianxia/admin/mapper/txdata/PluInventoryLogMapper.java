package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PluInventoryLog;

public interface PluInventoryLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PluInventoryLog record);

    int insertSelective(PluInventoryLog record);

    PluInventoryLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PluInventoryLog record);

    int updateByPrimaryKey(PluInventoryLog record);
}