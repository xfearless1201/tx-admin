package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.WashcodeConfig;

public interface WashcodeConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WashcodeConfig record);

    int insertSelective(WashcodeConfig record);

    WashcodeConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WashcodeConfig record);

    int updateByPrimaryKey(WashcodeConfig record);
}