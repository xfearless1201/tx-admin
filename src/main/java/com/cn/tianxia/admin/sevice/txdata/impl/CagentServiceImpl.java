package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.CagentMapper;
import com.cn.tianxia.admin.model.txdata.Cagent;
import com.cn.tianxia.admin.sevice.txdata.CagentService;

/**
 * 
 * @ClassName CagentServiceImpl
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Hardy
 * @Date 2019年4月22日 下午3:13:59
 * @version 1.0.0
 */
@Service
public class CagentServiceImpl implements CagentService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(CagentServiceImpl.class);
    
    @Autowired
    private CagentMapper cagentMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cagentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Cagent record) {
        return cagentMapper.insertSelective(record);
    }

    @Override
    public Cagent selectByPrimaryKey(Integer id) {
        return cagentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Cagent record) {
        return cagentMapper.updateByPrimaryKeySelective(record);
    }

}
