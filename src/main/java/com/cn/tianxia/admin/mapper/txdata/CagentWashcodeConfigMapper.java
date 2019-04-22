package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentWashcodeConfig;

public interface CagentWashcodeConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentWashcodeConfig record);

    int insertSelective(CagentWashcodeConfig record);

    CagentWashcodeConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentWashcodeConfig record);

    int updateByPrimaryKey(CagentWashcodeConfig record);
}