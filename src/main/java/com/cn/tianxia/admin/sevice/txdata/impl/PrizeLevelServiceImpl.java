package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.PrizeLevelMapper;
import com.cn.tianxia.admin.model.txdata.PrizeLevel;
import com.cn.tianxia.admin.sevice.txdata.PrizeLevelService;

@Service
public class PrizeLevelServiceImpl implements PrizeLevelService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(PrizeLevelServiceImpl.class);
    
    @Autowired
    private PrizeLevelMapper prizeLevelMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return prizeLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PrizeLevel record) {
        return prizeLevelMapper.insertSelective(record);
    }

    @Override
    public PrizeLevel selectByPrimaryKey(Integer id) {
        return prizeLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PrizeLevel record) {
        return prizeLevelMapper.updateByPrimaryKeySelective(record);
    }

}
