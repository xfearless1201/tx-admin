package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PluOrder;

public interface PluOrderService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PluOrder record);

    PluOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PluOrder record);
}
