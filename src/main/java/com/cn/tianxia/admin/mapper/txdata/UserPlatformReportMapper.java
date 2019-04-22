package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserPlatformReport;

public interface UserPlatformReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPlatformReport record);

    int insertSelective(UserPlatformReport record);

    UserPlatformReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPlatformReport record);

    int updateByPrimaryKey(UserPlatformReport record);
}