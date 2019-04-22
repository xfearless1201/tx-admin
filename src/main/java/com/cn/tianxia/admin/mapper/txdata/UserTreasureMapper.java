package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserTreasure;

public interface UserTreasureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserTreasure record);

    int insertSelective(UserTreasure record);

    UserTreasure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTreasure record);

    int updateByPrimaryKey(UserTreasure record);
}