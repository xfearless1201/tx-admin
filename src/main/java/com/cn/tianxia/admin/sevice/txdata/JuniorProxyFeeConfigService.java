package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.JuniorProxyFeeConfig;

public interface JuniorProxyFeeConfigService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(JuniorProxyFeeConfig record);

    JuniorProxyFeeConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JuniorProxyFeeConfig record);

}
