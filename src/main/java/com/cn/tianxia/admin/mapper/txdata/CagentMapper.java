package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.Cagent;

public interface CagentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cagent record);

    int insertSelective(Cagent record);

    Cagent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cagent record);

    int updateByPrimaryKey(Cagent record);
}