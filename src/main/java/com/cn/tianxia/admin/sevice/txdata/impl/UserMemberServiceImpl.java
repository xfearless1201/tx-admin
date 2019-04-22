package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.UserMemberMapper;
import com.cn.tianxia.admin.model.txdata.UserMember;
import com.cn.tianxia.admin.sevice.txdata.UserMemberService;

@Service
public class UserMemberServiceImpl implements UserMemberService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(UserMemberServiceImpl.class);
    
    @Autowired
    private UserMemberMapper userMemberMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer uid) {
        return userMemberMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insertSelective(UserMember record) {
        return userMemberMapper.insertSelective(record);
    }

    @Override
    public UserMember selectByPrimaryKey(Integer uid) {
        return userMemberMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(UserMember record) {
        return userMemberMapper.updateByPrimaryKeySelective(record);
    }

}
