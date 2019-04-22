package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentMsgconfig;

public interface CagentMsgconfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentMsgconfig record);

    int insertSelective(CagentMsgconfig record);

    CagentMsgconfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentMsgconfig record);

    int updateByPrimaryKey(CagentMsgconfig record);
}