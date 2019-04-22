package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserLuckrdrawLog;

public interface UserLuckrdrawLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLuckrdrawLog record);

    int insertSelective(UserLuckrdrawLog record);

    UserLuckrdrawLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLuckrdrawLog record);

    int updateByPrimaryKey(UserLuckrdrawLog record);
}