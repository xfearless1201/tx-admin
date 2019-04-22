package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.ConfigPay;

public interface ConfigPayService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ConfigPay record);

    ConfigPay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConfigPay record);

}
