package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentGamePercentage;

public interface CagentGamePercentageService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentGamePercentage record);

    CagentGamePercentage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentGamePercentage record);
}
