package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.SysResourceMapper;
import com.cn.tianxia.admin.model.txdata.SysResource;
import com.cn.tianxia.admin.sevice.txdata.SysResourceService;

@Service
public class SysResourceServiceImpl implements SysResourceService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(SysResourceServiceImpl.class);
    
    private SysResourceMapper sysResourceMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysResourceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(SysResource record) {
        return sysResourceMapper.insertSelective(record);
    }

    @Override
    public SysResource selectByPrimaryKey(Long id) {
        return sysResourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysResource record) {
        return sysResourceMapper.updateByPrimaryKeySelective(record);
    }

    
}
