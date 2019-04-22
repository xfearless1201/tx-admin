package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentPayer;

public interface CagentPayerService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentPayer record);

    CagentPayer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentPayer record);

}
