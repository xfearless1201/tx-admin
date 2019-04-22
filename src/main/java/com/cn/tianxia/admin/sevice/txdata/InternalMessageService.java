package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.InternalMessage;

public interface InternalMessageService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(InternalMessage record);

    InternalMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InternalMessage record);

}
