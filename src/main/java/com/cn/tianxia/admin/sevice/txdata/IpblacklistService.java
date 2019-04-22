package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.Ipblacklist;

public interface IpblacklistService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Ipblacklist record);

    Ipblacklist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ipblacklist record);

}
