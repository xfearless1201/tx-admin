package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.ProxyUserTs;

public interface ProxyUserTsService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ProxyUserTs record);

    ProxyUserTs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxyUserTs record);
}
