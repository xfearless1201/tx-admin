package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.Recharge;

public interface RechargeService {

    int deleteByPrimaryKey(Integer rId);

    int insertSelective(Recharge record);

    Recharge selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Recharge record);
}
