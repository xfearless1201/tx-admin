package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.QrcodeOss;

public interface QrcodeOssService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(QrcodeOss record);

    QrcodeOss selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QrcodeOss record);
}
