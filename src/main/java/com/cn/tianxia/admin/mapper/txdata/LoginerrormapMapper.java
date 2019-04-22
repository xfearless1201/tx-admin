package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.Loginerrormap;

public interface LoginerrormapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Loginerrormap record);

    int insertSelective(Loginerrormap record);

    Loginerrormap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Loginerrormap record);

    int updateByPrimaryKey(Loginerrormap record);
}