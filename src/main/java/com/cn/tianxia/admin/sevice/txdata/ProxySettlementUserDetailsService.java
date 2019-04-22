package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.ProxySettlementUserDetails;

public interface ProxySettlementUserDetailsService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ProxySettlementUserDetails record);

    ProxySettlementUserDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxySettlementUserDetails record);
}
