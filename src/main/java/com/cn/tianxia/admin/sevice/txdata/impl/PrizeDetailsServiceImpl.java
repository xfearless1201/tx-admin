package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cn.tianxia.admin.mapper.txdata.PrizeDetailsMapper;
import com.cn.tianxia.admin.model.txdata.PrizeDetails;
import com.cn.tianxia.admin.sevice.txdata.PrizeDetailsService;


public class PrizeDetailsServiceImpl implements PrizeDetailsService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(PrizeDetailsServiceImpl.class);
    
    @Autowired
    private PrizeDetailsMapper prizeDetailsMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return prizeDetailsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PrizeDetails record) {
        return prizeDetailsMapper.insertSelective(record);
    }

    @Override
    public PrizeDetails selectByPrimaryKey(Integer id) {
        return prizeDetailsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PrizeDetails record) {
        return prizeDetailsMapper.updateByPrimaryKeySelective(record);
    }

    
}
