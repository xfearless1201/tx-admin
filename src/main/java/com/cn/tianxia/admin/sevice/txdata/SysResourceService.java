package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.SysResource;

public interface SysResourceService {

    int deleteByPrimaryKey(Long id);

    int insertSelective(SysResource record);

    SysResource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysResource record);
}
