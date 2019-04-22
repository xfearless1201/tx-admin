package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.PayChannel;

public interface PayChannelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayChannel record);

    int insertSelective(PayChannel record);

    PayChannel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannel record);

    int updateByPrimaryKey(PayChannel record);
}