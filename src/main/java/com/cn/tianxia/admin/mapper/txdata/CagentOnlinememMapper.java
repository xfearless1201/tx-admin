package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentOnlinemem;

public interface CagentOnlinememMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentOnlinemem record);

    int insertSelective(CagentOnlinemem record);

    CagentOnlinemem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentOnlinemem record);

    int updateByPrimaryKey(CagentOnlinemem record);
}