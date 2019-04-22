package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserWalletLog;

public interface UserWalletLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserWalletLog record);

    int insertSelective(UserWalletLog record);

    UserWalletLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserWalletLog record);

    int updateByPrimaryKey(UserWalletLog record);
}