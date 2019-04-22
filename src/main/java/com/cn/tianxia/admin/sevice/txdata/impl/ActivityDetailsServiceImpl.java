package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.ActivityDetailsMapper;
import com.cn.tianxia.admin.model.txdata.ActivityDetails;
import com.cn.tianxia.admin.sevice.txdata.ActivityDetailsService;


/**
 * 
 * @ClassName ActivityDetailsServiceImpl
 * @Description 活动接口实现类
 * @author Hardy
 * @Date 2019年4月22日 下午3:00:49
 * @version 1.0.0
 */
@Service
public class ActivityDetailsServiceImpl implements ActivityDetailsService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(ActivityDetailsServiceImpl.class);
    
    @Autowired
    private ActivityDetailsMapper activityDetailsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return activityDetailsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ActivityDetails record) {
        return activityDetailsMapper.insertSelective(record);
    }

    @Override
    public ActivityDetails selectByPrimaryKey(Integer id) {
        return activityDetailsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ActivityDetails record) {
        return activityDetailsMapper.updateByPrimaryKeySelective(record);
    }
}
