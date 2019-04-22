package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.AccountsCollect;

public interface AccountsCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AccountsCollect record);

    int insertSelective(AccountsCollect record);

    AccountsCollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AccountsCollect record);

    int updateByPrimaryKey(AccountsCollect record);
}