package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.SigninRecord;

public interface SigninRecordService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(SigninRecord record);

    SigninRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SigninRecord record);
}
