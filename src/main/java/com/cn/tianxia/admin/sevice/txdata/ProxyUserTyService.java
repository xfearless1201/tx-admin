package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.ProxyUserTy;

public interface ProxyUserTyService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ProxyUserTy record);

    ProxyUserTy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxyUserTy record);
}
