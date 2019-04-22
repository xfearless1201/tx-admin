package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PluInventory;

public interface PluInventoryService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PluInventory record);

    PluInventory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PluInventory record);
}
