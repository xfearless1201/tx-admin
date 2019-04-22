package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.RoleResource;

public interface RoleResourceService {

    int deleteByPrimaryKey(Long id);

    int insertSelective(RoleResource record);

    RoleResource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleResource record);
}
