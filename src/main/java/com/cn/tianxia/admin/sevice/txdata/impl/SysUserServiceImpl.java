package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.SysUserMapper;
import com.cn.tianxia.admin.model.txdata.SysUser;
import com.cn.tianxia.admin.sevice.txdata.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(SysUserServiceImpl.class);
    
    @Autowired
    private SysUserMapper sysUserMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(SysUser record) {
        return sysUserMapper.insertSelective(record);
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

}
