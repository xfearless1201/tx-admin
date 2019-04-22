package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.GuagualeActivity;

public interface GuagualeActivityService {

    int deleteByPrimaryKey(Long id);

    int insertSelective(GuagualeActivity record);

    GuagualeActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GuagualeActivity record);

}
