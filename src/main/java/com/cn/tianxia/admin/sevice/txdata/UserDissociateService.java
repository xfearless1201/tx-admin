package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.UserDissociate;

public interface UserDissociateService {

    int deleteByPrimaryKey(Integer uid);

    int insertSelective(UserDissociate record);

    UserDissociate selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserDissociate record);
}
