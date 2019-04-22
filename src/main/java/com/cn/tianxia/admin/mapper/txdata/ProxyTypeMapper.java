package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.ProxyType;

public interface ProxyTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProxyType record);

    int insertSelective(ProxyType record);

    ProxyType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxyType record);

    int updateByPrimaryKey(ProxyType record);
}