package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.DicData;

public interface DicDataService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(DicData record);

    DicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DicData record);
}
