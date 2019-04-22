package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CommissionDetails;

public interface CommissionDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommissionDetails record);

    int insertSelective(CommissionDetails record);

    CommissionDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommissionDetails record);

    int updateByPrimaryKey(CommissionDetails record);
}