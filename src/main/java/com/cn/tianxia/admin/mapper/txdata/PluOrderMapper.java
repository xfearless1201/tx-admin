package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PluOrder;

public interface PluOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PluOrder record);

    int insertSelective(PluOrder record);

    PluOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PluOrder record);

    int updateByPrimaryKey(PluOrder record);
}