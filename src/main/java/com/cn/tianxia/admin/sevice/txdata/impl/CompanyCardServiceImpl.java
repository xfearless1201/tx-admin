package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.CompanyCardMapper;
import com.cn.tianxia.admin.model.txdata.CompanyCard;
import com.cn.tianxia.admin.sevice.txdata.CompanyCardService;

@Service
public class CompanyCardServiceImpl implements CompanyCardService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(CompanyCardServiceImpl.class);
    
    @Autowired
    private CompanyCardMapper companyCardMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return companyCardMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CompanyCard record) {
        return companyCardMapper.insertSelective(record);
    }

    @Override
    public CompanyCard selectByPrimaryKey(Integer id) {
        return companyCardMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CompanyCard record) {
        return companyCardMapper.updateByPrimaryKeySelective(record);
    }

    
}
