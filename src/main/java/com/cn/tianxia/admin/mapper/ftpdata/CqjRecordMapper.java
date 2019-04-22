package com.cn.tianxia.admin.mapper.ftpdata;

import com.cn.tianxia.admin.model.ftpdata.CqjRecord;

public interface CqjRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CqjRecord record);

    int insertSelective(CqjRecord record);

    CqjRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CqjRecord record);

    int updateByPrimaryKey(CqjRecord record);
}