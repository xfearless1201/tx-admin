package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.JuniorProxyUserTs;

public interface JuniorProxyUserTsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JuniorProxyUserTs record);

    int insertSelective(JuniorProxyUserTs record);

    JuniorProxyUserTs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JuniorProxyUserTs record);

    int updateByPrimaryKey(JuniorProxyUserTs record);
}