package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.JuniorProxyUserTs;

public interface JuniorProxyUserTsService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(JuniorProxyUserTs record);

    JuniorProxyUserTs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JuniorProxyUserTs record);

}
