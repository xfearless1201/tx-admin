package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserAcitivityRecord;

public interface UserAcitivityRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserAcitivityRecord record);

    int insertSelective(UserAcitivityRecord record);

    UserAcitivityRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAcitivityRecord record);

    int updateByPrimaryKey(UserAcitivityRecord record);
}