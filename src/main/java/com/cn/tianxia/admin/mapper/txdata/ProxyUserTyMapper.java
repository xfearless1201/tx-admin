package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.ProxyUserTy;

public interface ProxyUserTyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProxyUserTy record);

    int insertSelective(ProxyUserTy record);

    ProxyUserTy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxyUserTy record);

    int updateByPrimaryKey(ProxyUserTy record);
}