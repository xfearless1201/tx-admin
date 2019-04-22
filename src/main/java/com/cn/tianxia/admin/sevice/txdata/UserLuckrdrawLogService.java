package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserLuckrdrawLog;

public interface UserLuckrdrawLogService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserLuckrdrawLog record);

    UserLuckrdrawLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLuckrdrawLog record);
}
