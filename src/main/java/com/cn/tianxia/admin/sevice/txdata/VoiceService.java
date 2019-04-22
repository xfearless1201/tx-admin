package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.Voice;

public interface VoiceService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Voice record);

    Voice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Voice record);
}
