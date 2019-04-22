package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentStoredvalue;

public interface CagentStoredvalueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentStoredvalue record);

    int insertSelective(CagentStoredvalue record);

    CagentStoredvalue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentStoredvalue record);

    int updateByPrimaryKey(CagentStoredvalue record);
}