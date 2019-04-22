package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.JuniorProxyType;

public interface JuniorProxyTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JuniorProxyType record);

    int insertSelective(JuniorProxyType record);

    JuniorProxyType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JuniorProxyType record);

    int updateByPrimaryKey(JuniorProxyType record);
}