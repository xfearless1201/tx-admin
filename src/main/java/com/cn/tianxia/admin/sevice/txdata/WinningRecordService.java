package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.WinningRecord;

public interface WinningRecordService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(WinningRecord record);

    WinningRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WinningRecord record);
}
