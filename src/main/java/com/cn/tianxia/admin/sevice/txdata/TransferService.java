package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.Transfer;

public interface TransferService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Transfer record);

    Transfer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Transfer record);
}
