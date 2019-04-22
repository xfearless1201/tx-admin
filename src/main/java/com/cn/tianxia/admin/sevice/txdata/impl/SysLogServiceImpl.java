package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.SysLogMapper;
import com.cn.tianxia.admin.model.txdata.SysLog;
import com.cn.tianxia.admin.sevice.txdata.SysLogService;

@Service
public class SysLogServiceImpl implements SysLogService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(SysLogServiceImpl.class);
    
    @Autowired
    private SysLogMapper sysLogMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(SysLog record) {
        return sysLogMapper.insertSelective(record);
    }

    @Override
    public SysLog selectByPrimaryKey(Long id) {
        return sysLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysLog record) {
        return sysLogMapper.updateByPrimaryKeySelective(record);
    }

}
