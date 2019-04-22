package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.UserLuckrdrawLogMapper;
import com.cn.tianxia.admin.model.txdata.UserLuckrdrawLog;
import com.cn.tianxia.admin.sevice.txdata.UserLuckrdrawLogService;

@Service
public class UserLuckrdrawLogServiceImpl implements UserLuckrdrawLogService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(UserLuckrdrawLogServiceImpl.class);
    
    @Autowired
    private UserLuckrdrawLogMapper userLuckrdrawLogMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userLuckrdrawLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(UserLuckrdrawLog record) {
        return userLuckrdrawLogMapper.insertSelective(record);
    }

    @Override
    public UserLuckrdrawLog selectByPrimaryKey(Integer id) {
        return userLuckrdrawLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserLuckrdrawLog record) {
        return userLuckrdrawLogMapper.updateByPrimaryKeySelective(record);
    }

}
