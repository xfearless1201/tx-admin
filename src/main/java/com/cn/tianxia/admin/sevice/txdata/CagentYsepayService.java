package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentYsepay;

public interface CagentYsepayService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentYsepay record);

    CagentYsepay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentYsepay record);

}
