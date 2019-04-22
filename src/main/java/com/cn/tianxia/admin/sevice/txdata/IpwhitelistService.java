package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.Ipwhitelist;

public interface IpwhitelistService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Ipwhitelist record);

    Ipwhitelist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ipwhitelist record);

}
