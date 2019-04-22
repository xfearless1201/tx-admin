package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentPayer;

public interface CagentPayerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentPayer record);

    int insertSelective(CagentPayer record);

    CagentPayer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentPayer record);

    int updateByPrimaryKey(CagentPayer record);
}