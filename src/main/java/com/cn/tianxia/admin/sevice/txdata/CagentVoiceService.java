package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentVoice;

public interface CagentVoiceService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentVoice record);

    CagentVoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentVoice record);

}
