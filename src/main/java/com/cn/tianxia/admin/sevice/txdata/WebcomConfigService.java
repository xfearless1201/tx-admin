package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.WebcomConfig;

public interface WebcomConfigService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(WebcomConfig record);

    WebcomConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebcomConfig record);
}
