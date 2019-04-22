package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PluInfo;

public interface PluInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PluInfo record);

    int insertSelective(PluInfo record);

    PluInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PluInfo record);

    int updateByPrimaryKey(PluInfo record);
}