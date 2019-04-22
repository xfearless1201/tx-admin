package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.UserChannel;

public interface UserChannelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserChannel record);

    int insertSelective(UserChannel record);

    UserChannel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserChannel record);

    int updateByPrimaryKey(UserChannel record);
}