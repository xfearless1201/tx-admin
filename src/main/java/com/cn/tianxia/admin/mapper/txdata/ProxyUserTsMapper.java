package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.ProxyUserTs;

public interface ProxyUserTsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProxyUserTs record);

    int insertSelective(ProxyUserTs record);

    ProxyUserTs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxyUserTs record);

    int updateByPrimaryKey(ProxyUserTs record);
}