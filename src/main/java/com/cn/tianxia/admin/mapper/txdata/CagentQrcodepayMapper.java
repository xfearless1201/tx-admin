package com.cn.tianxia.admin.mapper.txdata;

import com.cn.tianxia.admin.model.txdata.CagentQrcodepay;

public interface CagentQrcodepayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CagentQrcodepay record);

    int insertSelective(CagentQrcodepay record);

    CagentQrcodepay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CagentQrcodepay record);

    int updateByPrimaryKey(CagentQrcodepay record);
}