package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CommissionSettlement;

public interface CommissionSettlementService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CommissionSettlement record);

    CommissionSettlement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommissionSettlement record);

}
