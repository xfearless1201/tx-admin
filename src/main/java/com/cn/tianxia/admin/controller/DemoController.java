package com.cn.tianxia.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.tianxia.admin.controller.base.BaseController;

@Controller
@RequestMapping("demo")
public class DemoController extends BaseController{
    
    @RequestMapping("/index")
    public String index(HttpServletRequest request,HttpServletResponse response){
        logger.info("访问第一个接口开始============start==================");
        return "index";
    }
}
