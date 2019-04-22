package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.LotteryRecordMapper;
import com.cn.tianxia.admin.model.txdata.LotteryRecord;
import com.cn.tianxia.admin.sevice.txdata.LotteryRecordService;

@Service
public class LotteryRecordServiceImpl implements LotteryRecordService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(LotteryRecordServiceImpl.class);
    
    @Autowired
    private LotteryRecordMapper lotteryRecordMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return lotteryRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(LotteryRecord record) {
        return lotteryRecordMapper.insertSelective(record);
    }

    @Override
    public LotteryRecord selectByPrimaryKey(Integer id) {
        return lotteryRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(LotteryRecord record) {
        return lotteryRecordMapper.updateByPrimaryKeySelective(record);
    }

}
