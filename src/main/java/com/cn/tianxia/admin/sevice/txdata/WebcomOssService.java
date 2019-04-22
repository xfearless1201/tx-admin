package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.WebcomOss;

public interface WebcomOssService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(WebcomOss record);

    WebcomOss selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WebcomOss record);
}
