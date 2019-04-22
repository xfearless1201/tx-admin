package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserAcitivityRecord;

public interface UserAcitivityRecordService {

    int deleteByPrimaryKey(Long id);

    int insertSelective(UserAcitivityRecord record);

    UserAcitivityRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAcitivityRecord record);

}
