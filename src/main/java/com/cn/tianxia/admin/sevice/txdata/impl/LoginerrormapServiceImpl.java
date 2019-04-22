package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.LoginerrormapMapper;
import com.cn.tianxia.admin.model.txdata.Loginerrormap;
import com.cn.tianxia.admin.sevice.txdata.LoginerrormapService;

@Service
public class LoginerrormapServiceImpl implements LoginerrormapService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(LoginerrormapServiceImpl.class);
    
    @Autowired
    private LoginerrormapMapper loginerrormapMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return loginerrormapMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Loginerrormap record) {
        return loginerrormapMapper.insertSelective(record);
    }

    @Override
    public Loginerrormap selectByPrimaryKey(Integer id) {
        return loginerrormapMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Loginerrormap record) {
        return loginerrormapMapper.updateByPrimaryKeySelective(record);
    }

}
