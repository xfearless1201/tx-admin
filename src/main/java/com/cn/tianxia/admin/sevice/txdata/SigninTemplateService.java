package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.SigninTemplate;

public interface SigninTemplateService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(SigninTemplate record);

    SigninTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SigninTemplate record);
}
