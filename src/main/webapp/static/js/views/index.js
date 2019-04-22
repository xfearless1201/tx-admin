/**
 * 
 */

var index_tabs;
var layout_west_tree;
var indexTabsMenu;
var easy_messager;
var revnum=0;
var depnum=0;
$(function() {
	if(url_userTypeId == 0){
		editUserPwd()
	}else{
		$('#index_layout').layout({
			fit : true
		});
		index_tabs = $('#index_tabs').tabs(
				{
					fit : true,
					border : false,
					onContextMenu : function(e, title) {
						e.preventDefault();
						indexTabsMenu.menu('show', {
							left : e.pageX,
							top : e.pageY
						}).data('tabTitle', title);
					},
					tools : [
							{
								iconCls : 'fi-home',
								handler : function() {
									index_tabs.tabs('select', 0);
								}
							},
							{
								iconCls : 'fi-loop',
								handler : function() {
									refreshTab();
								}
							},
							{
								iconCls : 'fi-x',
								handler : function() {
									var index = index_tabs.tabs('getTabIndex',
											index_tabs.tabs('getSelected'));
									var tab = index_tabs.tabs('getTab', index);
									if (tab.panel('options').closable) {
										index_tabs.tabs('close', index);
									}
								}
							} ]
				});
		// 选项卡菜单
		indexTabsMenu = $('#tabsMenu').menu(
				{
					onClick : function(item) {
						var curTabTitle = $(this).data('tabTitle');
						var type = $(item.target).attr('type');
						if (type === 'refresh') {
							refreshTab();
							return;
						}
						if (type === 'close') {
							var t = index_tabs.tabs('getTab', curTabTitle);
							if (t.panel('options').closable) {
								index_tabs.tabs('close', curTabTitle);
							}
							return;
						}
						var allTabs = index_tabs.tabs('tabs');
						var closeTabsTitle = [];
						$.each(allTabs, function() {
							var opt = $(this).panel('options');
							if (opt.closable && opt.title != curTabTitle
									&& type === 'closeOther') {
								closeTabsTitle.push(opt.title);
							} else if (opt.closable && type === 'closeAll') {
								closeTabsTitle.push(opt.title);
							}
						});
						for (var i = 0; i < closeTabsTitle.length; i++) {
							index_tabs.tabs('close', closeTabsTitle[i]);
						}
					}
				});

		layout_west_tree = $('#layout_west_tree')
				.tree(
						{
							url : path +'/resource/tree',
							parentField : 'pid',
							lines : false,
							animate : true,
							onClick : function(node) {
								var opts = {
									title : node.text,
									border : false,
									closable : true,
									fit : true,
									iconCls : node.iconCls
								};
								var url = node.attributes;
								if (url && url.indexOf("http") == -1) {
									url =path+ url;
								}
								if (node.openMode == 'iframe') {
									opts.content = '<iframe src="'
											+ url
											+ '" frameborder="0" style="border:0;width:100%;height:99.5%;"></iframe>';
									addTab(opts);
								} else if (url) {
									opts.href = url;
									addTab(opts);
								}
							},
							/*formatter:function(node){
								var s=node.text;
								if(s.indexOf('审核')!=-1){
									s ='<font color="red" >'+node.text+'</font>';
								}
								return s;
							},  */
							onBeforeExpand : function(node) {
								$('#layout_west_tree').tree('collapseAll');
							},
							onLoadSuccess : function(node) {
								document.getElementById("_easyui_tree_2").click();
							}
						});

		
	}
	
});

function addTab(opts) {

	var allTabs = index_tabs.tabs('tabs');
	var closeTabsTitle = [];
	$.each(allTabs, function() {
		var opt = $(this).panel('options');
		closeTabsTitle.push(opt.title);
	});
	for (var i = 0; i < closeTabsTitle.length; i++) {
		if (closeTabsTitle[i] != '首页') {
			index_tabs.tabs('close', closeTabsTitle[i]);
		}
	}

	var t = $('#index_tabs');
	if (t.tabs('exists', opts.title)) {
		t.tabs('select', opts.title);
	} else {
		t.tabs('add', opts);
	}
}

function refreshTab() {
	var index = index_tabs.tabs('getTabIndex', index_tabs.tabs('getSelected'));
	var tab = index_tabs.tabs('getTab', index);
	var options = tab.panel('options');
	if (options.content) {
		index_tabs.tabs('update', {
			tab : tab,
			options : {
				content : options.content
			}
		});
	} else {
		tab.panel('refresh', options.href);
	}
}

function logout() {
	$.messager.confirm('提示', '确定要退出?', function(r) {
		if (r) {
			progressLoad();
			$.post(path +'/logout', function(result) {
				if (result.success) {
					progressClose();
					window.location.href = path+"/login";
				}
			}, 'json');
		}
	});
}

function indexout() { 
	top.location.reload();
}

function editUserPwd() {
	var titleVar = "";
	if(url_userTypeId == 0){
		titleVar = "首次登入请修改密码";
	}else{
		titleVar = "修改密码";
	}
	parent.$.modalDialog({
		title : titleVar,
		width : 300,
		height : 250,
		href : path +'/user/editPwdPage',
		buttons : [ {
			text : '确定',
			handler : function() {
				var f = parent.$.modalDialog.handler.find('#editUserPwdForm');
				f.submit();
			}
		} ]
	});
}



function playSound(id, url) {
	var ele = document.getElementById(id);

	ele.setAttribute('src', url);
	ele.play();
}

function withdrawals() {
	easy_messager.window('close');
	$.messager.progress('close');
	var opts = {
		title : '提款审核',
		border : false,
		closable : true,
		fit : true,
		iconCls : 'fi-torsos on'
	};
	opts.href = path +'/fundManage/reviewWithdrawPage';
	window.parent.addTab(opts);
}

function LoginannounCement() {
	$.ajax({
		url : path +'/cagent/isAnnounCement',
		type : 'post',
		async : true,
		cache : false,
		dataType : "json",
		success : function(data) {
			$("#announCement").html(data.msg);
		}
	});
}

function pendingReviewIndex() {
	LoginannounCement();

	$.ajax({
		url : path +'/tAmountRecord/pendingReviewData',
		type : 'post',
		dataType : "json",
		success : function(data) {
			if (data.tarId > parseInt($("#tarId").html())) {
				if (data.rechangeSound != null) {
					playSound('rechangeSound', data.rechangeSound);
				}
			}
			if (data.dedId > parseInt($("#dedId").html())) {
				if (data.withdrawSound != null) {
					playSound('withdrawSound', data.withdrawSound);
				}
			}
			$("#tarId").html(parseInt(data.tarId));
			$("#pendingCount").html(data.revCount);

			$("#dedId").html(parseInt(data.dedId));
			$("#toBeDepositCount").html(data.dePositCount);

			$("#newUserCount").html(data.userCount);
			
			
			if(revnum!=data.revCount){
				console.log(revnum+'_'+data.revCount); 
				var allTabs = index_tabs.tabs('tabs');
				var closeTabsTitle = [];
				$.each(allTabs, function() {
					var opt = $(this).panel('options');
					closeTabsTitle.push(opt.title);
				});
				for (var i = 0; i < closeTabsTitle.length; i++) {
					if (closeTabsTitle[i] == '存款审核') {
						tAmountList.datagrid('load', $.serializeObject($('#searchForm')));
						console.log(closeTabsTitle[i]);
					}
				} 
				revnum=data.revCount;
			}
			if(depnum!=data.dePositCount){
				console.log(depnum+'_'+data.dePositCount);
				var allTabs = index_tabs.tabs('tabs');
				var closeTabsTitle = [];
				$.each(allTabs, function() {
					var opt = $(this).panel('options');
					closeTabsTitle.push(opt.title);
				});
				for (var i = 0; i < closeTabsTitle.length; i++) {
					if (closeTabsTitle[i] == '提款审核') { 
						reviewWithdraw.datagrid('load', $.serializeObject($('#searchReviewWithdrawForm')));
						console.log(closeTabsTitle[i]);
					}
				} 
				depnum=data.dePositCount;
			} 
			
			
		}
	});

}
//pendingReviewIndex();
//setInterval("pendingReviewIndex()", 1000 * 7); 

function transferFaildInfo() {
	var t = $("#transferFaildPage").html();
	if (t != undefined) {
		$.ajax({
			url : path +'/transfer/transferFaildInfo',
			type : 'post',
			async : true,
			cache : false,
			dataType : "json",
			success : function(data) {
				if (data.success) {
					$.messager.show({
						title : '提示',
						msg : '存在转账失败需要进行补单的数据！！！',
						timeout : 1000 * 59 * 10,
						showType : 'slide'
					});
				}
			}
		});
	}
}
setInterval("transferFaildInfo()", 1000 * 60 * 10);

function changeStatus(checked) {

	if (checked == false) {
		$("#checkedvalue").val("OFF");
	} else if (checked == true) {
		$("#checkedvalue").val("ON");
	}
}

function depositPage() {
	var opts = {
		title : '存款审核',
		border : false,
		closable : true,
		fit : true,
		iconCls : 'fi-torsos on'
	};
	opts.href = path +'/tAmountRecord/getlist';
	window.parent.addTab(opts);
}
function withdRawalsPage() {
	var opts = {
		title : '提款审核',
		border : false,
		closable : true,
		fit : true,
		iconCls : 'fi-torsos on'
	};
	opts.href = path +'/fundManage/reviewWithdrawPage';
	window.parent.addTab(opts);
}

function newUserCount() {
	$("#newUserCount").html("");
	$.ajax({
		url : path +'/newUserCount',
		type : 'post',
		dataType : "json",
		success : function(data) {
			$("#newUserCount").html(data);
		}
	});
}

function queryNewUser() {
	//             newUserCount();
	var opts = {
		title : '平台会员管理',
		border : false,
		closable : true,
		fit : true,
		iconCls : 'fi-torsos on'
	};
	opts.href = path +'/platform/user/list?isNewUser=1';
	window.parent.addTab(opts);
}

//在线管理员
function onlineNumber() {
	parent.$.modalDialog({
		title : '在线管理员',
		width : 370,
		height : 500,
		fit : false,
		href : path +'/user/onlineNumber',
		buttons : [ {
			text : '关闭',
			handler : function() {
				parent.$.modalDialog.openner_dataGrid = onlineNumberList;
				parent.$.modalDialog.handler.dialog('close');
				onlineNumberList.datagrid('reload');
			}
		} ]
	});
}
//在线代理商
function onlineProxy() {
	parent.$.modalDialog({
		title : '在线代理商',
		width : 480,
		height : 500,
		fit : false,
		href : path +'/user/onlineProxy',
		buttons : [ {
			text : '关闭',
			handler : function() {
				parent.$.modalDialog.openner_dataGrid = onlineProxyList;
				parent.$.modalDialog.handler.dialog('close');
				onlineProxyList.datagrid('reload');
			}
		} ]
	});
}

//if("gyc"==LuserName){
//	setInterval("pendingReviewIndex()", 1000 * 5); 
//}else{ 
	var websocket = null;
	var username = "cagent";
	var host = (window.location.protocol == 'http:') ? 'ws://' : 'wss://';

	//判断当前浏览器是否支持WebSocket  
	if ('WebSocket' in window) {
		websocket = new ReconnectingWebSocket(host + document.location.host
				+Staticpath+ "/websocket/" + username + "/");
	} else {
	}
	//连接发生错误的回调方法  
	websocket.onerror = function() {
		console.log("WebSocket连接发生错误"); 
	};

	//连接成功建立的回调方法  
	websocket.onopen = function() {
		console.log("WebSocket连接成功");
	}
	//接收到消息的回调方法  
	websocket.onmessage = function(event) {
		var str = JSON.parse(event.data);
		var announCement = str.announcement;
		console.log(event.data);
		$("#announCement").html(announCement);
		if (parseInt($("#tarId").html()) == 0) {
			$("#tarId").html(parseInt(str.tarId));
			if (str.rechangeSound != null && str.rechangeSound != ""
					&& parseInt(str.revCount) > 0) {
				playSound('rechangeSound', str.rechangeSound);
			}
		} else {
			if (str.tarId > parseInt($("#tarId").html())) {
				if (str.rechangeSound != null && str.rechangeSound != "") {
					playSound('rechangeSound', str.rechangeSound);
				}
			}
		}
		if (parseInt($("#dedId").html()) == 0) {
			$("#dedId").html(parseInt(str.dedId));
			if (str.withdrawSound != null && str.withdrawSound != ""
					&& parseInt(str.dePositCount) > 0) {
				playSound('withdrawSound', str.withdrawSound);
			}
		} else {
			if (str.dedId > parseInt($("#dedId").html())) {
				if (str.withdrawSound != null && str.withdrawSound != "") {
					playSound('withdrawSound', str.withdrawSound);
				}
			}
		}
		$("#tarId").html(parseInt(str.tarId));
		$("#pendingCount").html(str.revCount);

		$("#dedId").html(parseInt(str.dedId));
		$("#toBeDepositCount").html(str.dePositCount);
		$("#newUserCount").html(str.userCount);
		$("#onlinenum").html(str.onlinenum);
		$("#onlineproxy").html(str.proxyNum);
		if(revnum!=str.revCount){
			console.log(revnum+'_'+str.revCount); 
			var allTabs = index_tabs.tabs('tabs');
			var closeTabsTitle = [];
			$.each(allTabs, function() {
				var opt = $(this).panel('options');
				closeTabsTitle.push(opt.title);
			});
			for (var i = 0; i < closeTabsTitle.length; i++) {
				if (closeTabsTitle[i] == '存款审核') {
					tAmountList.datagrid('load', $.serializeObject($('#searchForm')));
					console.log(closeTabsTitle[i]);
				}
			} 
			revnum=str.revCount;
		}
		if(depnum!=str.dePositCount){
			console.log(depnum+'_'+str.dePositCount);
			var allTabs = index_tabs.tabs('tabs');
			var closeTabsTitle = [];
			$.each(allTabs, function() {
				var opt = $(this).panel('options');
				closeTabsTitle.push(opt.title);
			});
			for (var i = 0; i < closeTabsTitle.length; i++) {
				if (closeTabsTitle[i] == '提款审核') { 
					reviewWithdraw.datagrid('load', $.serializeObject($('#searchReviewWithdrawForm')));
					console.log(closeTabsTitle[i]);
				}
			} 
			depnum=str.dePositCount;
		} 
	}
	
	function reconnect(){
		websocket = new ReconnectingWebSocket(host + document.location.host
				+Staticpath+ "/websocket/" + username + "/");
	}
	
	//连接关闭的回调方法  
	websocket.onclose = function() {
		console.log("WebSocket连接关闭"); 
//		pendingReviewIndex();
//		console.info("尝试重连..." + new Date().format("yyyy-MM-dd hh:mm:ss"));
//		setInterval("reconnect()", 5000); 
	}
	
	//关闭WebSocket连接  
	function closeWebSocket() {
		websocket.close();
	} 
//}
