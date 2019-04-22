package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PluInventoryLog;

public interface PluInventoryLogService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PluInventoryLog record);

    PluInventoryLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PluInventoryLog record);
}
