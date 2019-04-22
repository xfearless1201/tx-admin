package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.RefererUrl;

public interface RefererUrlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RefererUrl record);

    int insertSelective(RefererUrl record);

    RefererUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RefererUrl record);

    int updateByPrimaryKey(RefererUrl record);
}