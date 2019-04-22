package com.cn.tianxia.admin.sevice.txdata;

import com.cn.tianxia.admin.model.txdata.CagentQrcodepay;

public interface CagentQrcodepayService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(CagentQrcodepay record);

    CagentQrcodepay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentQrcodepay record);

}
