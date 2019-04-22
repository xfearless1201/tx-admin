package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.AmountRecord;

public interface AmountRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AmountRecord record);

    int insertSelective(AmountRecord record);

    AmountRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmountRecord record);

    int updateByPrimaryKey(AmountRecord record);
}