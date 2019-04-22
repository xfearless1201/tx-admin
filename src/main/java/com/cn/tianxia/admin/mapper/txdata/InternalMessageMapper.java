package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.InternalMessage;

public interface InternalMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InternalMessage record);

    int insertSelective(InternalMessage record);

    InternalMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InternalMessage record);

    int updateByPrimaryKey(InternalMessage record);
}