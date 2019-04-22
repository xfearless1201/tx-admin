package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.WashcodeConfig;

public interface WashcodeConfigService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(WashcodeConfig record);

    WashcodeConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WashcodeConfig record);
}
