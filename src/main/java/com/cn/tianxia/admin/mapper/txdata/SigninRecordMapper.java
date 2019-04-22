package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.SigninRecord;

public interface SigninRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SigninRecord record);

    int insertSelective(SigninRecord record);

    SigninRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SigninRecord record);

    int updateByPrimaryKey(SigninRecord record);
}