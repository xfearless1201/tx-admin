package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentBankCard;

public interface CagentBankCardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentBankCard record);

    int insertSelective(CagentBankCard record);

    CagentBankCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentBankCard record);

    int updateByPrimaryKey(CagentBankCard record);
}