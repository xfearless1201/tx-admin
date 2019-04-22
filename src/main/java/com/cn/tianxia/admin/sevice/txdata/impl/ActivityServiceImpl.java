package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.ActivityMapper;
import com.cn.tianxia.admin.model.txdata.Activity;
import com.cn.tianxia.admin.sevice.txdata.ActivityService;

/**
 * 
 * @ClassName ActivityServiceImpl
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Hardy
 * @Date 2019年4月22日 下午3:03:41
 * @version 1.0.0
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    //日志
    private static final Logger logger = LoggerFactory.getLogger(ActivityServiceImpl.class);
    
    @Autowired
    private ActivityMapper activityMapper;
    
    @Override
    public int deleteByPrimaryKey(Long id) {
        return activityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Activity record) {
        return activityMapper.insertSelective(record);
    }

    @Override
    public Activity selectByPrimaryKey(Long id) {
        return activityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Activity record) {
        return activityMapper.updateByPrimaryKeySelective(record);
    }

}
