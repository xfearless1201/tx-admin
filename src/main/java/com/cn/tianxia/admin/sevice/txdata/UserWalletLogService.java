package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserWalletLog;

public interface UserWalletLogService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserWalletLog record);

    UserWalletLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserWalletLog record);
}
