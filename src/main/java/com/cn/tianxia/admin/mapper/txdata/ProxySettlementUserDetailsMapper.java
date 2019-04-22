package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.ProxySettlementUserDetails;

public interface ProxySettlementUserDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProxySettlementUserDetails record);

    int insertSelective(ProxySettlementUserDetails record);

    ProxySettlementUserDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxySettlementUserDetails record);

    int updateByPrimaryKey(ProxySettlementUserDetails record);
}