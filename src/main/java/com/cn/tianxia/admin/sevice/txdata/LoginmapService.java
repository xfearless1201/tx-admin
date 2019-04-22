package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.Loginmap;

public interface LoginmapService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Loginmap record);

    Loginmap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Loginmap record);

}
