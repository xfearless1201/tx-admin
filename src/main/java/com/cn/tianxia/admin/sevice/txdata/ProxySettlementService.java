package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.ProxySettlement;

public interface ProxySettlementService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ProxySettlement record);

    ProxySettlement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxySettlement record);
}
