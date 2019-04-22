package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PayWithdrawConfig;

public interface PayWithdrawConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayWithdrawConfig record);

    int insertSelective(PayWithdrawConfig record);

    PayWithdrawConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayWithdrawConfig record);

    int updateByPrimaryKey(PayWithdrawConfig record);
}