package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.AmountRecord;

public interface AmountRecordService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(AmountRecord record);

    AmountRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AmountRecord record);
}
