package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.UserAcitivityRecordMapper;
import com.cn.tianxia.admin.model.txdata.UserAcitivityRecord;
import com.cn.tianxia.admin.sevice.txdata.UserAcitivityRecordService;

@Service
public class UserAcitivityRecordServiceImpl implements UserAcitivityRecordService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(UserAcitivityRecordServiceImpl.class);
    
    @Autowired
    private UserAcitivityRecordMapper userAcitivityRecordMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return userAcitivityRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(UserAcitivityRecord record) {
        return userAcitivityRecordMapper.insertSelective(record);
    }

    @Override
    public UserAcitivityRecord selectByPrimaryKey(Long id) {
        return userAcitivityRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserAcitivityRecord record) {
        return userAcitivityRecordMapper.updateByPrimaryKeySelective(record);
    }

}
