package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentOnlinemem;

public interface CagentOnlinememService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentOnlinemem record);

    CagentOnlinemem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentOnlinemem record);

}
