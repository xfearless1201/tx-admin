package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentWashcodeConfig;

public interface CagentWashcodeConfigService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentWashcodeConfig record);

    CagentWashcodeConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentWashcodeConfig record);

}
