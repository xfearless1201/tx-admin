package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.JuniorProxyUserTy;

public interface JuniorProxyUserTyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JuniorProxyUserTy record);

    int insertSelective(JuniorProxyUserTy record);

    JuniorProxyUserTy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JuniorProxyUserTy record);

    int updateByPrimaryKey(JuniorProxyUserTy record);
}