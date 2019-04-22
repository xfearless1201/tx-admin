package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserPlatformReport;

public interface UserPlatformReportService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserPlatformReport record);

    UserPlatformReport selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPlatformReport record);
}
