package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentPay;

public interface CagentPayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentPay record);

    int insertSelective(CagentPay record);

    CagentPay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentPay record);

    int updateByPrimaryKey(CagentPay record);
}