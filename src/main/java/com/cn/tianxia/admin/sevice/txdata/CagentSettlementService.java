package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentSettlement;

public interface CagentSettlementService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentSettlement record);

    CagentSettlement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentSettlement record);

}
