package com.cn.tianxia.admin.sevice.txdata.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.tianxia.admin.mapper.txdata.WebcomImgMapper;
import com.cn.tianxia.admin.model.txdata.WebcomImg;
import com.cn.tianxia.admin.sevice.txdata.WebcomImgService;

@Service
public class WebcomImgServiceImpl implements WebcomImgService {

    // 日志
    private static final Logger logger = LoggerFactory.getLogger(WebcomImgServiceImpl.class);
    
    @Autowired
    private WebcomImgMapper webcomImgMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return webcomImgMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(WebcomImg record) {
        return webcomImgMapper.insertSelective(record);
    }

    @Override
    public WebcomImg selectByPrimaryKey(Integer id) {
        return webcomImgMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WebcomImg record) {
        return webcomImgMapper.updateByPrimaryKeySelective(record);
    }

}
