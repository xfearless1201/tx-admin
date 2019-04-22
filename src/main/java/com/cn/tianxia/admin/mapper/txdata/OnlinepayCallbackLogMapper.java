package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.OnlinepayCallbackLog;

public interface OnlinepayCallbackLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OnlinepayCallbackLog record);

    int insertSelective(OnlinepayCallbackLog record);

    OnlinepayCallbackLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OnlinepayCallbackLog record);

    int updateByPrimaryKey(OnlinepayCallbackLog record);
}