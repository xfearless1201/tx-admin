package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentWallet;

public interface CagentWalletService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentWallet record);

    CagentWallet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentWallet record);
}
