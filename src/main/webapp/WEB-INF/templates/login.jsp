<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<%@ include file="/commons/basejs.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="renderer" content="webkit" /> 
    <title>用户登录-天下网络</title>
   <meta name="viewport" content="width=device-width"> 
    <link rel="stylesheet" type="text/css" href="${staticPath }/static/style/css/login.css?v=201612202107" />
    <script type="text/javascript" src="${staticPath }/static/login.js" charset="utf-8"></script>  
</head>
<body onkeydown="enterlogin();">
<div class="top_div"></div>
<div style="background: rgb(255, 255, 255); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231);border-image:none;width:400px;text-align: center;">
    <form method="post" id="loginform">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
        <P style="padding: 30px 0px 10px; position: relative;">
            <span class="u_logo"></span>
            <input class="ipt" type="text" name="username" placeholder="请输入用户名"/>
        </P>
        <P style="position: relative;">
            <span class="p_logo"></span>
            <input class="ipt" id="password" type="password" name="password" placeholder="请输入密码"/>
        </P> 
        <P style="position: relative;text-align: left;display: none;">
            <input class="rememberMe" type="checkbox" name="rememberMe" value="1" checked style="vertical-align:middle;margin-left:40px;height:20px;"/> 记住密码
        </P>
        <div style="height: 50px; line-height: 50px; margin-top: 10px;border-top-color: rgb(231, 231, 231); border-top-width: 1px; border-top-style: solid;">
            <P style="margin: 0px 35px 20px 45px;">
                <span style="Double: left;">
                    <a style="color: rgb(204, 204, 204);" href="javascript:;"></a>
                </span>
                <span style="Double: right;">
                    <a style="color: rgb(204, 204, 204); margin-right: 10px;" href="javascript:;"></a>
                    <a style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;" href="javascript:;" onclick="submitForm()">登录</a>
                </span>
            </P>
        </div>
    </form>
</div>
	<script type="text/javascript"> 
		try {
			indexout();
		} catch (e) {
		 
		}
	
	</script>
<div style="text-align:center;">
    <p>
        <a href="#" target="_blank" ></a>
  	</p>
</div>
</body>
</html>
