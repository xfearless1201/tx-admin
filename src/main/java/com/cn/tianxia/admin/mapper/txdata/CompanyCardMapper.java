package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CompanyCard;

public interface CompanyCardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyCard record);

    int insertSelective(CompanyCard record);

    CompanyCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyCard record);

    int updateByPrimaryKey(CompanyCard record);
}