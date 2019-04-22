package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.ProxyFeeConfig;

public interface ProxyFeeConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProxyFeeConfig record);

    int insertSelective(ProxyFeeConfig record);

    ProxyFeeConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxyFeeConfig record);

    int updateByPrimaryKey(ProxyFeeConfig record);
}