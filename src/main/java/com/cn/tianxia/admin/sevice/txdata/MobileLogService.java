package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.MobileLog;

public interface MobileLogService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(MobileLog record);

    MobileLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MobileLog record);

}
