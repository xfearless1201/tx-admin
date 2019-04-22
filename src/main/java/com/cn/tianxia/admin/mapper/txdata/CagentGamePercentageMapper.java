package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentGamePercentage;

public interface CagentGamePercentageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentGamePercentage record);

    int insertSelective(CagentGamePercentage record);

    CagentGamePercentage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentGamePercentage record);

    int updateByPrimaryKey(CagentGamePercentage record);
}