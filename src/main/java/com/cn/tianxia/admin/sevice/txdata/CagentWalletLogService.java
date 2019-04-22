package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentWalletLog;

public interface CagentWalletLogService {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentWalletLog record);

    CagentWalletLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentWalletLog record);
}
