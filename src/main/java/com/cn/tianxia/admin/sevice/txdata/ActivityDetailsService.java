package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.ActivityDetails;

/**
 * 
 * @ClassName ActivityDetailsService
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Hardy
 * @Date 2019年4月22日 下午3:01:29
 * @version 1.0.0
 */
public interface ActivityDetailsService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ActivityDetails record);

    ActivityDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActivityDetails record);

}
