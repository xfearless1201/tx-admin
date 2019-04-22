package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentBankCard;

public interface CagentBankCardService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentBankCard record);

    CagentBankCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentBankCard record);

}
