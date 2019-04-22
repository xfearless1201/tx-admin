package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.ProxyFeeConfig;

public interface ProxyFeeConfigService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ProxyFeeConfig record);

    ProxyFeeConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxyFeeConfig record);
}
