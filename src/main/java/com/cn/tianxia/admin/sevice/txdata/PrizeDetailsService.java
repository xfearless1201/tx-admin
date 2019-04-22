package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PrizeDetails;

public interface PrizeDetailsService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PrizeDetails record);

    PrizeDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PrizeDetails record);
}
