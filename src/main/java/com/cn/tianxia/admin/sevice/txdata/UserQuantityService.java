package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserQuantity;

public interface UserQuantityService {
    
    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserQuantity record);

    UserQuantity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserQuantity record);
}
