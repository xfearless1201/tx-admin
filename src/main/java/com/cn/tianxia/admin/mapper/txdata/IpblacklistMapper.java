package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.Ipblacklist;

public interface IpblacklistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ipblacklist record);

    int insertSelective(Ipblacklist record);

    Ipblacklist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ipblacklist record);

    int updateByPrimaryKey(Ipblacklist record);
}