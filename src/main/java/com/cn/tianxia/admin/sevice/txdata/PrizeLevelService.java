package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PrizeLevel;

public interface PrizeLevelService {
    
    int deleteByPrimaryKey(Integer id);

    int insertSelective(PrizeLevel record);

    PrizeLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PrizeLevel record);
}
