package com.cn.tianxia.admin.controller.sys;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.tianxia.admin.controller.base.BaseController;

/**
 * 
 * @ClassName SysPageController
 * @Description 系统视图页面接口
 * @author Hardy
 * @Date 2019年4月22日 上午10:41:20
 * @version 1.0.0
 */
@Controller
public class SysPageController extends BaseController{
    
    @RequestMapping(value = {"/"})
    public String index(){
        return "index";
    }

    @RequestMapping("login")
    public String login(HttpServletRequest request){
        logger.info("访问登录页面开始=================start================");
        return "login";
    }
}
