package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PluCate;

public interface PluCateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PluCate record);

    int insertSelective(PluCate record);

    PluCate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PluCate record);

    int updateByPrimaryKey(PluCate record);
}