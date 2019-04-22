package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.WinningRecord;

public interface WinningRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WinningRecord record);

    int insertSelective(WinningRecord record);

    WinningRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WinningRecord record);

    int updateByPrimaryKey(WinningRecord record);
}