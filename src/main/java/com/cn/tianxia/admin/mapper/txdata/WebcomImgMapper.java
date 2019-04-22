package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.WebcomImg;

public interface WebcomImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WebcomImg record);

    int insertSelective(WebcomImg record);

    WebcomImg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebcomImg record);

    int updateByPrimaryKey(WebcomImg record);
}