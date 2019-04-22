package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.ReserveAccount;

public interface ReserveAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReserveAccount record);

    int insertSelective(ReserveAccount record);

    ReserveAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReserveAccount record);

    int updateByPrimaryKey(ReserveAccount record);
}