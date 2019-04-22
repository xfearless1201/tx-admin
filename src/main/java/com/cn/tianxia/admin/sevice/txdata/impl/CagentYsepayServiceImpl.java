package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.CagentYsepayMapper;
import com.cn.tianxia.admin.model.txdata.CagentYsepay;
import com.cn.tianxia.admin.sevice.txdata.CagentYsepayService;

@Service
public class CagentYsepayServiceImpl implements CagentYsepayService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(CagentYsepayServiceImpl.class);
    
    @Autowired
    private CagentYsepayMapper cagentYsepayMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cagentYsepayMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CagentYsepay record) {
        return cagentYsepayMapper.insertSelective(record);
    }

    @Override
    public CagentYsepay selectByPrimaryKey(Integer id) {
        return cagentYsepayMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CagentYsepay record) {
        return cagentYsepayMapper.updateByPrimaryKeySelective(record);
    }

}
