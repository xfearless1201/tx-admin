package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.DicDataMapper;
import com.cn.tianxia.admin.model.txdata.DicData;
import com.cn.tianxia.admin.sevice.txdata.DicDataService;

@Service
public class DicDataServiceImpl implements DicDataService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(DicDataServiceImpl.class);
    
    @Autowired
    private DicDataMapper dicDataMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dicDataMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(DicData record) {
        return dicDataMapper.insertSelective(record);
    }

    @Override
    public DicData selectByPrimaryKey(Integer id) {
        return dicDataMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(DicData record) {
        return dicDataMapper.updateByPrimaryKeySelective(record);
    }

    

}
