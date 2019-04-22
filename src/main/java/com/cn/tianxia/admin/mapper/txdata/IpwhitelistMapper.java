package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.Ipwhitelist;

public interface IpwhitelistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ipwhitelist record);

    int insertSelective(Ipwhitelist record);

    Ipwhitelist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ipwhitelist record);

    int updateByPrimaryKey(Ipwhitelist record);
}