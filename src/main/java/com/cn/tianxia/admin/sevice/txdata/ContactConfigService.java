package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.ContactConfig;

public interface ContactConfigService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ContactConfig record);

    ContactConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ContactConfig record);

}
