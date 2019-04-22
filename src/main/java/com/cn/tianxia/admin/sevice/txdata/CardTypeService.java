package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CardType;

public interface CardTypeService {

    int deleteByPrimaryKey(Integer bankId);

    int insertSelective(CardType record);

    CardType selectByPrimaryKey(Integer bankId);

    int updateByPrimaryKeySelective(CardType record);

}
