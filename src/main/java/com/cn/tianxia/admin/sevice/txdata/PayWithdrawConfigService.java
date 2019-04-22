package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PayWithdrawConfig;

public interface PayWithdrawConfigService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PayWithdrawConfig record);

    PayWithdrawConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayWithdrawConfig record);

}
