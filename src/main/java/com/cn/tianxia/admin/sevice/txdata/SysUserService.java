package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.SysUser;

public interface SysUserService {

    int deleteByPrimaryKey(Long id);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);
}
