package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserChannel;

public interface UserChannelService {

    int deleteByPrimaryKey(Long id);

    int insertSelective(UserChannel record);

    UserChannel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserChannel record);
}
