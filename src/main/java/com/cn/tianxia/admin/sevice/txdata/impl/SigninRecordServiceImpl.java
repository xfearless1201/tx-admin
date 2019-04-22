package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.SigninRecordMapper;
import com.cn.tianxia.admin.model.txdata.SigninRecord;
import com.cn.tianxia.admin.sevice.txdata.SigninRecordService;

@Service
public class SigninRecordServiceImpl implements SigninRecordService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(SigninRecordServiceImpl.class);
    
    @Autowired
    private SigninRecordMapper signinRecordMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return signinRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(SigninRecord record) {
        return signinRecordMapper.insertSelective(record);
    }

    @Override
    public SigninRecord selectByPrimaryKey(Integer id) {
        return signinRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SigninRecord record) {
        return signinRecordMapper.updateByPrimaryKeySelective(record);
    }

}
