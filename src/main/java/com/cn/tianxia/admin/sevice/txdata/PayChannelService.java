package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PayChannel;

public interface PayChannelService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(PayChannel record);

    PayChannel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayChannel record);

}
