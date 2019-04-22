<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/basejs.jsp"%>
<%@ include file="/commons/global.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%
	String url_userTypeId= request.getSession().getAttribute("loginstatus")+"";
%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <mete name="viewport" content="width=device-width,initial-scale=1"/>  --> 
<script>
	var url_userTypeId = "<%=url_userTypeId%>";
</script>
<script type="text/javascript" src="${staticPath }/static/reconnecting-websocket.min.js" charset="utf-8"></script>
<title>主页</title> 
</head>
<body>
	<div id="loading"
		style="position:fixed; top: -50%; left: -50%; width: 200%; height: 200%; background: #fff; z-index: 100; overflow: hidden;">
		<img src="${staticPath }/static/style/images/ajax-loader.gif"
			style="position: absolute; top: 0; left: 0; right: 0; bottom: 0; margin: auto;" />
	</div>
	<div id="index_layout">
		<div data-options="region:'north',border:false"
			style="overflow: hidden; background-color: #7498ad;"> 
			<div>  
				<span
					style="float: right; margin-top: 15px; color: #333;"> 
					<!-- <span style="color:white;"plain="true" >实时查询开关</span><input value="OFF" id="checkedvalue" class="easyui-switchbutton" width="70px"  data-options="onChange:function(checked){changeStatus(checked);}">&nbsp;&nbsp;&nbsp; -->
					<a href="#"><span style="visibility: hidden" id="tarId">0</span></a>
					<a href="#"><span style="visibility: hidden" id="dedId">0</span></a>
					<a href="javascript:void(0)" onclick="" class="easyui-linkbutton" id="LUserName"
					plain="true" icon="fi-torso" style="color: white;"><shiro:principal></shiro:principal></a>
					&nbsp; <a href="javascript:void(0);" class="easyui-linkbutton"
					icon="fi-torso" onclick="onlineNumber();">在线管理员<span
						style="color: red;">(<span id="onlinenum"
							style="color: red;">0</span>)
					</span></a> &nbsp; <a href="javascript:void(0);" class="easyui-linkbutton"
					icon="fi-torso" onclick="onlineProxy();">在线代理商<span
						style="color: red;">(<span id="onlineproxy"
							style="color: red;">0</span>)
					</span></a> &nbsp; 
					<shiro:hasPermission name="/tAmountRecord/getlist">
						<a href="javascript:void(0);" class="easyui-linkbutton"
						icon="fi-dollar" onclick="depositPage();">待审核存款 <span
							style="color: red;">(<span id="pendingCount"
								style="color: red;">0</span>)
						</span></a>&nbsp;&nbsp; 
					</shiro:hasPermission>
					<shiro:hasPermission name="/fundManage/reviewWithdrawPage">
						<a href="javascript:void(0);"
						class="easyui-linkbutton" icon="fi-dollar"
						onclick="withdRawalsPage();">待审核提款<span style="color: red;">(<span
								id="toBeDepositCount" style="color: red;">0</span>)
						</span></a>&nbsp;&nbsp; 
					</shiro:hasPermission>
					<a href="javascript:void(0);"
					class="easyui-linkbutton" icon="fi-torso" onclick="queryNewUser();">今日注册<span
						style="color: red;">(<span id="newUserCount"
							style="color: red;">0</span>)
					</span>
				</a>&nbsp;&nbsp;&nbsp;<%-- <a href="javascript:void(0);" class="l-btn-left"  style="color: #ffffff;font-size: inherit;text-decoration: none;" onclick="newUserCount()"><img src="${path }/static/style/images/ref.png" height="18" width="18" style="position: relative;top: 4px;"/></a> --%>
					<a href="skype:txwl18899?chat" class="easyui-linkbutton"
					icon="fi-social-skype icon-yellow">skype业务支持</a> &nbsp; <shiro:hasPermission
						name="/user/editPwdPage"> 
						<a href="javascript:void(0)" onclick="editUserPwd()"
							class="easyui-linkbutton" icon="fi-unlock">修改密码</a>
					</shiro:hasPermission>&nbsp;&nbsp; <a href="javascript:void(0)" onclick="logout()"
					class="easyui-linkbutton" icon="fi-x">安全退出</a>
				</span> <span class="header" style="float: right; margin-right: 110px;">
				</span>
			</div>
		</div>
		<div data-options="region:'west',split:true" title="菜单"
			style="width: 200px; overflow: hidden; overflow-y: auto; padding: 0px">
			<div class="well well-small" style="padding: 5px 5px 5px 5px;">
				<ul id="layout_west_tree"></ul>
			</div>
		</div> 
		<div data-options="region:'center'"> 
			<div id="index_tabs" style="overflow: hidden; minWidth: 1500px"
				style="position:relative;"> 
				<marquee direction="left" scrollAmount=5 height="24px">

					<span
						style="text-align: center; color: red; font-size: 15px; top: 0px;"
						id="announCement">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						</span>
				</marquee> 
			</div>
		</div>
		<div data-options="region:'center'" style="overflow-x: auto;">
			<div data-options="region:'center'">
				<div id="index_tabs" style="overflow: hidden; minWidth: 100%"> 
				</div>
			</div>
		</div> 
	</div>
	<!-- 第三方支付提示音 -->
	<audio id="paySound" src="">
	</audio>
	<!--公司入款提示音  -->
	<audio id="rechangeSound" src="">
	</audio>
	<!-- 提款提示音 -->
	<audio id="withdrawSound" src="">
	</audio>
	
	<shiro:hasPermission name="/transfer/transferFaildPage">
		<span style="visibility: hidden" id="transferFaildPage">1</span>
	</shiro:hasPermission>  
	<style>
marquee {
	width: 66%;
	height: 25px;
	line-height: 24px;
	position: absolute;
	z-index: 999;
	margin: auto;
	left: 0;
	right: 0;
}

marquee p {
	height: 23px;
	line-height: 23px;
	margin: 0;
	padding: 0;
	color: red;
}
</style>
</body>
<script type="text/javascript">
var path='${path }';
var Staticpath='${staticPath }';	
var LuserName='${LuserName }';
var check1=0;
 $.ajaxSetup({ 
	complete : function(XMLHttpRequest, textStatus) {  
		var ipstatus = XMLHttpRequest.getResponseHeader("Ipstatus"); //通过XMLHttpRequest取得响应头,Ipstatus， 
		var sessionstatus = XMLHttpRequest.getResponseHeader("sessionstatus"); //通过XMLHttpRequest取得响应头,sessionstatus， 
		console.log(sessionstatus);
		if(sessionstatus=='timeout'){
			var top = getTopWinow(); 
			top.location.href = path+"/login"; 
		}
 		if (ipstatus == 'false' && "QUC" == LuserName.toUpperCase()) {
 			if(check1==0){
 				check1=1;
 				var oldip= XMLHttpRequest.getResponseHeader("OldIp"); 
 				var newip= XMLHttpRequest.getResponseHeader("NewIp"); 
 				var top = getTopWinow(); //获取当前页面的顶层窗口对象 
 				$.post(path +'/logout', function(result) { 
 				}, 'json');
				$.messager.alert("操作提示", "系统监测到IP地址变更:"+oldip+"--->"+newip+",请重新登录", "info", function () { 
 					top.location.href = path+"/login"; //跳转到登陆页面 对多服务器同样适用
 		        });
 			} 
 		}
	}
}); 
 
 /**
  * 在页面中任何嵌套层次的窗口中获取顶层窗口
  * @return 当前页面的顶层窗口对象
  */
 function getTopWinow(){
     var p = window;
     while(p != p.parent){
         p = p.parent;
     }
     return p;
 }

</script>
<script type="text/javascript" src="${staticPath }/static/js/views/index.js"></script> 
</html>