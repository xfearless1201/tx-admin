package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.PayWithdrawConfigMapper;
import com.cn.tianxia.admin.model.txdata.PayWithdrawConfig;
import com.cn.tianxia.admin.sevice.txdata.PayWithdrawConfigService;

@Service
public class PayWithdrawConfigServiceImpl implements PayWithdrawConfigService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(PayWithdrawConfigServiceImpl.class);
    
    @Autowired
    private PayWithdrawConfigMapper payWithdrawConfigMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return payWithdrawConfigMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PayWithdrawConfig record) {
        return payWithdrawConfigMapper.insertSelective(record);
    }

    @Override
    public PayWithdrawConfig selectByPrimaryKey(Integer id) {
        return payWithdrawConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PayWithdrawConfig record) {
        return payWithdrawConfigMapper.updateByPrimaryKeySelective(record);
    }

}
