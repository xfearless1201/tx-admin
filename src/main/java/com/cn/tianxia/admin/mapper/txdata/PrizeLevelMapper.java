package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PrizeLevel;

public interface PrizeLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PrizeLevel record);

    int insertSelective(PrizeLevel record);

    PrizeLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PrizeLevel record);

    int updateByPrimaryKey(PrizeLevel record);
}