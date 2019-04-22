package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.SigninTemplate;

public interface SigninTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SigninTemplate record);

    int insertSelective(SigninTemplate record);

    SigninTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SigninTemplate record);

    int updateByPrimaryKey(SigninTemplate record);
}