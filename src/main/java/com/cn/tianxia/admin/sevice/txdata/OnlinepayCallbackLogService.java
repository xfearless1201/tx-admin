package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.OnlinepayCallbackLog;

public interface OnlinepayCallbackLogService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(OnlinepayCallbackLog record);

    OnlinepayCallbackLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OnlinepayCallbackLog record);

}
