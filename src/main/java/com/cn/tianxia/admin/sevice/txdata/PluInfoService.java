package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PluInfo;

public interface PluInfoService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PluInfo record);

    PluInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PluInfo record);
}
