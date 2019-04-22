package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentStoredvalueLog;

public interface CagentStoredvalueLogService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentStoredvalueLog record);

    CagentStoredvalueLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentStoredvalueLog record);

}
