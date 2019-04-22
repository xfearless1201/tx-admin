package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CardType;

public interface CardTypeMapper {
    int deleteByPrimaryKey(Integer bankId);

    int insert(CardType record);

    int insertSelective(CardType record);

    CardType selectByPrimaryKey(Integer bankId);

    int updateByPrimaryKeySelective(CardType record);

    int updateByPrimaryKey(CardType record);
}