package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.Cagent;

public interface CagentService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Cagent record);

    Cagent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cagent record);
}
