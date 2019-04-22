package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.WebcomImg;

public interface WebcomImgService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(WebcomImg record);

    WebcomImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebcomImg record);
}
