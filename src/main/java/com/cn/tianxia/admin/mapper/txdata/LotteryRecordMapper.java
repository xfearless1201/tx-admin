package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.LotteryRecord;

public interface LotteryRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LotteryRecord record);

    int insertSelective(LotteryRecord record);

    LotteryRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LotteryRecord record);

    int updateByPrimaryKey(LotteryRecord record);
}