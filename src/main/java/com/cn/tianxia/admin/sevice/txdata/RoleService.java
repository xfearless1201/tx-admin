package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.Role;

public interface RoleService {

    int deleteByPrimaryKey(Long id);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);
}
