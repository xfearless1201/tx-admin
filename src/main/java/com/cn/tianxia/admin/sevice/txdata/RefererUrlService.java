package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.RefererUrl;

public interface RefererUrlService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(RefererUrl record);

    RefererUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RefererUrl record);
}
