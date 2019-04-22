package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.Loginmap;

public interface LoginmapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Loginmap record);

    int insertSelective(Loginmap record);

    Loginmap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Loginmap record);

    int updateByPrimaryKey(Loginmap record);
}