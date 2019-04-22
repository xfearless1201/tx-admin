package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.ConfigPay;

public interface ConfigPayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConfigPay record);

    int insertSelective(ConfigPay record);

    ConfigPay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConfigPay record);

    int updateByPrimaryKey(ConfigPay record);
}