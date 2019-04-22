package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentMsgconfig;

public interface CagentMsgconfigService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentMsgconfig record);

    CagentMsgconfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentMsgconfig record);

}
