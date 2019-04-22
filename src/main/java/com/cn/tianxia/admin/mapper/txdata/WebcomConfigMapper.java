package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.WebcomConfig;

public interface WebcomConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WebcomConfig record);

    int insertSelective(WebcomConfig record);

    WebcomConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebcomConfig record);

    int updateByPrimaryKey(WebcomConfig record);
}