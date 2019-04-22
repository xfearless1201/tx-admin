package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.ReserveAccount;

public interface ReserveAccountService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ReserveAccount record);

    ReserveAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReserveAccount record);
}
