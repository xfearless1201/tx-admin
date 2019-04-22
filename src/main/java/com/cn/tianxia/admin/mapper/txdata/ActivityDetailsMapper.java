package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.ActivityDetails;

public interface ActivityDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActivityDetails record);

    int insertSelective(ActivityDetails record);

    ActivityDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityDetails record);

    int updateByPrimaryKey(ActivityDetails record);
}