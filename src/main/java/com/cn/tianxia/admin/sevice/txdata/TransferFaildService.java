package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.TransferFaild;

public interface TransferFaildService {
    
    int deleteByPrimaryKey(Integer id);

    int insertSelective(TransferFaild record);

    TransferFaild selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TransferFaild record);

}
