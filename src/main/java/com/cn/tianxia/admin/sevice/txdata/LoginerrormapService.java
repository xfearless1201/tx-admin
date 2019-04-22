package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.Loginerrormap;

public interface LoginerrormapService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Loginerrormap record);

    Loginerrormap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Loginerrormap record);

}
