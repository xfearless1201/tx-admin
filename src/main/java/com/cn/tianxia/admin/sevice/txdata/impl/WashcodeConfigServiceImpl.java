package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.WashcodeConfigMapper;
import com.cn.tianxia.admin.model.txdata.WashcodeConfig;
import com.cn.tianxia.admin.sevice.txdata.WashcodeConfigService;

@Service
public class WashcodeConfigServiceImpl implements WashcodeConfigService {
 
    // 日志
    private static final Logger logger = LoggerFactory.getLogger(WashcodeConfigServiceImpl.class);
    
    @Autowired
    private WashcodeConfigMapper washcodeConfigMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return washcodeConfigMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WashcodeConfig record) {
        return washcodeConfigMapper.insertSelective(record);
    }

    @Override
    public WashcodeConfig selectByPrimaryKey(Integer id) {
        return washcodeConfigMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WashcodeConfig record) {
        return washcodeConfigMapper.updateByPrimaryKeySelective(record);
    }

}
