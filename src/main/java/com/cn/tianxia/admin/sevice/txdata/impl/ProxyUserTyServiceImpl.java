package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.ProxyUserTyMapper;
import com.cn.tianxia.admin.model.txdata.ProxyUserTy;
import com.cn.tianxia.admin.sevice.txdata.ProxyUserTyService;

@Service
public class ProxyUserTyServiceImpl implements ProxyUserTyService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(ProxyUserTyServiceImpl.class);
    
    @Autowired
    private ProxyUserTyMapper proxyUserTyMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return proxyUserTyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ProxyUserTy record) {
        return proxyUserTyMapper.insertSelective(record);
    }

    @Override
    public ProxyUserTy selectByPrimaryKey(Integer id) {
        return proxyUserTyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ProxyUserTy record) {
        return proxyUserTyMapper.updateByPrimaryKeySelective(record);
    }

}
