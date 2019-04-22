package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PluInventory;

public interface PluInventoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PluInventory record);

    int insertSelective(PluInventory record);

    PluInventory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PluInventory record);

    int updateByPrimaryKey(PluInventory record);
}