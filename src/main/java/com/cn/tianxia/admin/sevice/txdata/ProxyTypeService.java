package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.ProxyType;

public interface ProxyTypeService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ProxyType record);

    ProxyType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxyType record);
}
