package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CompanyCard;

public interface CompanyCardService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CompanyCard record);

    CompanyCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyCard record);

}
