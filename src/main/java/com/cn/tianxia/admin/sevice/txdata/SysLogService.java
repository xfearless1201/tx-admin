package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.SysLog;

public interface SysLogService {

    int deleteByPrimaryKey(Long id);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLog record);
}
