package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserQuantity;

public interface UserQuantityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserQuantity record);

    int insertSelective(UserQuantity record);

    UserQuantity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserQuantity record);

    int updateByPrimaryKey(UserQuantity record);
}