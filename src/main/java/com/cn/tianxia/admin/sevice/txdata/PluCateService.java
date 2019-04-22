package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PluCate;

public interface PluCateService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PluCate record);

    PluCate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PluCate record);
}
