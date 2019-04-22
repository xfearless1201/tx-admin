package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.MobileLog;

public interface MobileLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MobileLog record);

    int insertSelective(MobileLog record);

    MobileLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MobileLog record);

    int updateByPrimaryKey(MobileLog record);
}