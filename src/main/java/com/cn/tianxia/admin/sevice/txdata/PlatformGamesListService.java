package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.PlatformGamesList;

public interface PlatformGamesListService {

    int deleteByPrimaryKey(Long id);

    int insertSelective(PlatformGamesList record);

    PlatformGamesList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PlatformGamesList record);
}
