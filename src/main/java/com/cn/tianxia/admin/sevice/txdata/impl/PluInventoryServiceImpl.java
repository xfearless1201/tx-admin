package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.PluInventoryMapper;
import com.cn.tianxia.admin.model.txdata.PluInventory;
import com.cn.tianxia.admin.sevice.txdata.PluInventoryService;

@Service
public class PluInventoryServiceImpl implements PluInventoryService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(PluInventoryServiceImpl.class);
    
    @Autowired
    private PluInventoryMapper pluInventoryMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return pluInventoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(PluInventory record) {
        return pluInventoryMapper.insertSelective(record);
    }

    @Override
    public PluInventory selectByPrimaryKey(Integer id) {
        return pluInventoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PluInventory record) {
        return pluInventoryMapper.updateByPrimaryKeySelective(record);
    }

}
