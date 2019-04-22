package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.JuniorProxyType;

public interface JuniorProxyTypeService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(JuniorProxyType record);

    JuniorProxyType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JuniorProxyType record);

}
