package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.JuniorProxyUserTy;

public interface JuniorProxyUserTyService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(JuniorProxyUserTy record);

    JuniorProxyUserTy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JuniorProxyUserTy record);

}
