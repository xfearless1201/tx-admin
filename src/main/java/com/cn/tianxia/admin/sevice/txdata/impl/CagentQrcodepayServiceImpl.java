package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.CagentQrcodepayMapper;
import com.cn.tianxia.admin.model.txdata.CagentQrcodepay;
import com.cn.tianxia.admin.sevice.txdata.CagentQrcodepayService;

@Service
public class CagentQrcodepayServiceImpl implements CagentQrcodepayService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(CagentQrcodepayServiceImpl.class);
    
    @Autowired
    private CagentQrcodepayMapper cagentQrcodepayMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cagentQrcodepayMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(CagentQrcodepay record) {
        return cagentQrcodepayMapper.insertSelective(record);
    }

    @Override
    public CagentQrcodepay selectByPrimaryKey(Integer id) {
        return cagentQrcodepayMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CagentQrcodepay record) {
        return cagentQrcodepayMapper.updateByPrimaryKeySelective(record);
    }

}
