package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentStoredvalue;

public interface CagentStoredvalueService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentStoredvalue record);

    CagentStoredvalue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentStoredvalue record);

}
