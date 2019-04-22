package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PrizeDetails;

public interface PrizeDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PrizeDetails record);

    int insertSelective(PrizeDetails record);

    PrizeDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PrizeDetails record);

    int updateByPrimaryKey(PrizeDetails record);
}