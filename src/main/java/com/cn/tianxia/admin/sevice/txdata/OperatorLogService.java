package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.OperatorLog;

public interface OperatorLogService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(OperatorLog record);

    OperatorLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OperatorLog record);

}
