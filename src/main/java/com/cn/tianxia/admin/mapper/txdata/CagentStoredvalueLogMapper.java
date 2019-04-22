package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentStoredvalueLog;

public interface CagentStoredvalueLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentStoredvalueLog record);

    int insertSelective(CagentStoredvalueLog record);

    CagentStoredvalueLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentStoredvalueLog record);

    int updateByPrimaryKey(CagentStoredvalueLog record);
}