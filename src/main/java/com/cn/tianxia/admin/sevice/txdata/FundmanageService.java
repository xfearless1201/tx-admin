package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.Fundmanage;

public interface FundmanageService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Fundmanage record);

    Fundmanage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fundmanage record);

}
