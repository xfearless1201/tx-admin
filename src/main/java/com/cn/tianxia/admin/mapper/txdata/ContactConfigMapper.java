package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.ContactConfig;

public interface ContactConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ContactConfig record);

    int insertSelective(ContactConfig record);

    ContactConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContactConfig record);

    int updateByPrimaryKey(ContactConfig record);
}