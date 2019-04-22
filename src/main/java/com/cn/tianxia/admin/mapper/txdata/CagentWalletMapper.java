package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentWallet;

public interface CagentWalletMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentWallet record);

    int insertSelective(CagentWallet record);

    CagentWallet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentWallet record);

    int updateByPrimaryKey(CagentWallet record);
}