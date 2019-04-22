package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.LotteryRecord;

public interface LotteryRecordService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(LotteryRecord record);

    LotteryRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryRecord record);

}
