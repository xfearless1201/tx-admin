package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CommissionDetails;

public interface CommissionDetailsService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CommissionDetails record);

    CommissionDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommissionDetails record);

}
