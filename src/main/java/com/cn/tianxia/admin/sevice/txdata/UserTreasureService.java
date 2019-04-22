package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserTreasure;

public interface UserTreasureService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserTreasure record);

    UserTreasure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserTreasure record);

}
