/**
 * 
 */

var platformUserlist;
var selectRow;
//是否是查询新注册会员
if("1"==url_isNewUser){
    var time1 = new Date().format("yyyy-MM-dd 00:00:00");
    var time2 = new Date().format("yyyy-MM-dd 23:59:59");
    $("#startTime").val(time1);
    $("#endTime").val(time2);
}else{
    var time1 = new Date();

    time1.setMonth(time1.getMonth()-5);

    var time2 = new Date().format("yyyy-MM-dd 23:59:59");
    $("#startTime").val("2017-06-01 00:00:00");
    $("#endTime").val(time2);
}

    $(function () {
    	platformUserlist =$('#userlist').datagrid({
            url: path +'/platform/user/findByPage',
            striped: true,
            pagination: true,
            checkbox:true,
            fitColumns: false,
            idField: 'uid',
            pageSize: 25,
            pageList: [25, 50, 100],
            queryParams:{
            startTime:$("#startTime").val(),
                endTime:$("#endTime").val(),
                isStop:$("#query_userStatus").val(),
                freeUser:0
			},
            columns: [[
            {
    			field : "uid",
    			checkbox:true,
    			width: 80
    		},{
    			field : "username",
    			title : "会员账号",
    			width: 130
    		},{
    			field : "realname",
    			title : "用户名",
    			width: 60
    		},{
    			field : "wallet",
    			title : "钱包金额", 
    			width: 75
    		},{
    			field : "integral",
    			title : "积分", 
				hidden:'true',
                width: 60
    		},{
    			field : "isStop",
    			title : "状态",
    			width: 40,
    			formatter: function(value,row,index) {
                    if(value==1){
                        return '<font color="red">停用</font>';
                    }else{
                        return '<font color="green">正常</font>';
                    }
    			}
    		},{
    			field : "userQuantity",
    			title : "打码量<br/>输赢额",
    			width: 90,
    			formatter:function(value,row,index){
    				var str='';
    				if(row.userQuantity>0){
    					str+= '<font color="green">'+row.userQuantity.toFixed(2)+'</font>';
					}else if(row.userQuantity<0){
						str+= '<font color="red">'+row.userQuantity.toFixed(2)+'</font>';
					}else{
						str+= row.userQuantity;
					}
    				str+='<br/>';
    				if(row.userWinAmount>0){
    					str+= '<font color="green">'+row.userWinAmount.toFixed(2)+'</font>';
					}else if(row.userWinAmount<0){
						str+= '<font color="red">'+row.userWinAmount.toFixed(2)+'</font>';
					}else{
						str+= row.userWinAmount;
					}
    				return str;
    			}
    		},{
    			field : "topUidName",
    			title : "代理商<br/>层级",
    			width: 90,
    			formatter:function(value,row,index){
    				var str='';
    				if(value==''||value==null||value==undefined){
    					str= '平台会员';
    				}else{
    					str= value;
    				}
    				str+='<br/>';
    				str+=row.typeName;
    				return str;
    			}
    		},{
    			field : "regDate",
    			title : "注册日期</br>注册IP",
    			width: 125,
    			formatter:function(value,row,index){
    				var str=value; 
    				str+='<br/>';
    				str+=numberToIp(row.regIp);
    				return str;
    			}
    		},{
    			field : "isMobile",
    			title : "注册方式</br>注册来源",
    			width: 120,
    			formatter: function(value,row,index) {
    				var mobile = "";
       				if(value==0||value==null){
       					mobile = "PC";
       				}else if(value==1){
       					mobile = "手机";
       				}else if(value==2){
       					mobile = "APP";
       				}else if(value==3){
       					mobile = "IOS";
       				}else if(value==4){
       					mobile = "Android";
       				}else if(value == 99){
       					mobile = "手工注册";
       				}
       				return mobile + "</br>"+row.regurl;
    			}
    		},{
    			field : "c1",
    			title : "常用操作",
    			width: 310,
                formatter : function(value, row, index) {
                    var str = '';
                            str += $.formatString(' <a href="javascript:void(0)" class="user-easyui-linkbutton-edit l-btn l-btn-small" onclick="reportSettlementDetailsFun(\'{0}\');"><span class="l-btn-left l-btn-icon-left"><span class="l-btn-text" style="margin-left:4px">打码量</span></span></a>', row.uid);
                            str += $.formatString(' <a href="javascript:void(0)" class="user-easyui-linkbutton-edit l-btn l-btn-small" onclick="gameBalanceFun(\'{0}\',\'{1}\');"><span class="l-btn-left l-btn-icon-left"><span class="l-btn-text" style="margin-left:4px">游戏厅余额</span></span></a>', row.uid,row.wallet);
                            str += $.formatString(' <a href="javascript:void(0)" class="user-easyui-linkbutton-edit l-btn l-btn-small" onclick=" amountInfoFun(\'{0}\');"><span class="l-btn-left l-btn-icon-left"><span class="l-btn-text" style="margin-left:4px">资金流水</span></span></a>', row.username);
                            str += $.formatString(' <a href="javascript:void(0)" class="user-easyui-linkbutton-edit l-btn l-btn-small" onclick=" userLoginRecordFun(\'{0}\',\'{1}\');"><span class="l-btn-left l-btn-icon-left"><span class="l-btn-text" style="margin-left:4px">登录记录</span></span></a>', row.uid,row.username);
                    		str += $.formatString(' <a href="javascript:void(0)" class="user-easyui-linkbutton-edit l-btn l-btn-small" onclick=" selectUserDetailFun(\'{0}\');"><span class="l-btn-left l-btn-icon-left"><span class="l-btn-text" style="margin-left:4px">输赢详情</span></span></a>', row.uid);
                            return str;
                }
    		}
            ]],
            toolbar : '#platformUserToolbar',
            onLoadSuccess:function(data){
            	platformUserlist.datagrid('clearSelections'); 
            	if(integral==1){
            		$('#userlist').datagrid('showColumn','integral');
            	}
            },
    		onBeforeLoad: function (param) {
    			if(js_url_userTypeId!=null){
    				param.urlUserType = js_url_userTypeId;
        			param.urlCagent = js_url_cagentName;
    			}
    			if(url_topUid!="null"){
    				param.topUid = url_topUid;
    			}
    			if(url_topUidName!="null"){
    				$("#queryName").val(url_topUidName);
    				param.topUidName = $("#queryName").val();
    				$('#querySelect').val("topUidName"); 
    				$('#queryName').attr('name','topUidName');
    			}
    			if(url_username!="null"){
    				$("#queryName").val(url_username);
    				param.username = $("#queryName").val();
    			}
    		},
            toolbar : '#platformUserToolbar'
        }); 
    	
    	
    	$("#querySelect").combobox({
    		onChange: function (n,o) {
    			$('#queryName').attr('name',n);
    		}
    	});
    	
    	$('#sendMessageDiv').dialog({
		    onClose:function(){
		    	 $('#sendMess').val('');
		    }
		});

         $.ajax({
            url:path +'/cagent/combobox',
            type:'post',
            async:true,
            cache:false,
            dataType :"json",
            success:function(data){
                var htm="<option value=''>全部</option>";
                for(var i=0;i<data.length;i++){
                    htm+="<option value="+data[i].cagent+">"+data[i].name+"</option>";
                }
                $('#combobox_cid').html(htm);
                $('#combobox_cid').combobox({});
            }
        });
    	
    });
    
    function disabledAccount(freeUser) {
		var cbox = platformUserlist.datagrid('getChecked');
		if (cbox == "") {
			$.messager.alert('提示',"请选择要的停用账号！！");
			return;
		}
		var ids="";
		for ( var i in cbox) {
			ids+=cbox[i].uid+","
		}
		$.messager.confirm('询问', '是否停用？', function(index) {
			if (index) {
			progressLoad();
             $.post(path +'/platform/user/chooseuserstatus', {
            	 ids : ids,
 				column:0,
 				value:1,
 				freeUser:freeUser
             },  function(result) {
                 if (result.success) {
                     parent.$.messager.alert('提示', "停用成功", 'info');
                     platformUserlist.datagrid('reload');
                 } else {
                     parent.$.messager.alert('错误', result.msg, 'error');
                 }
                 progressClose();
             }, 'JSON');
			}
		});
	}
	function enabledAccount(freeUser) {
		var cbox = platformUserlist.datagrid('getChecked');
		if (cbox == "") {
			$.messager.alert('提示',"请选择要的启用账号！");
			return;
		}
		var ids="";
		for ( var i in cbox) {
			ids+=cbox[i].uid+","
		}
		$.messager.confirm('询问', '是否启用账号？', function(index) {
			if (index) {
			 progressLoad();
             $.post(path +'/platform/user/chooseuserstatus', {
            	 ids : ids,
 				column:0,
 				value:0,
 				freeUser:freeUser
             }, function(result) {
                 if (result.success) {
                     parent.$.messager.alert('提示', "启用成功", 'info');
                     platformUserlist.datagrid('reload');
                 } else {
                     parent.$.messager.alert('错误', result.msg, 'error');
                 }
                 progressClose();
             }, 'JSON');
			}
		});
	}
    
	function editPlatformUserFun(id) {
        var cid=0;
        if (id == undefined) {
            var rows = platformUserlist.datagrid('getChecked');
            if (rows == "") {
    			$.messager.alert('提示',"请选择要编辑的用户！！");
    			return;
    		}
            if(rows.length>1){
            	$.messager.alert('提示',"只能选择一个用户！！");
    			return;
            }
            id = rows[0].uid;
            cid=rows[0].cid;
        } else {
            platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
        }
        parent.$.modalDialog({
            title : '编辑',
            width : 400,
            height : 480,
            href : path +'/platform/user/editPage?id=' + id+'&cid='+cid,
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#platformUserEditForm');
                    f.submit();
                }
            } ]
        });
    }
	function editPlatformfreeUserFun(id) {
		var cid=0;
		if (id == undefined) {
			var rows = platformUserlist.datagrid('getChecked');
			if (rows == "") {
				$.messager.alert('提示',"请选择要编辑的用户！！");
				return;
			}
			if(rows.length>1){
				$.messager.alert('提示',"只能选择一个用户！！");
				return;
			}
			id = rows[0].uid;
			cid=rows[0].cid;
		} else {
			platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
		}
		parent.$.modalDialog({
			title : '编辑',
			width : 400,
			height : 480,
			href : path +'/platform/user/editPage?id=' + id+'&cid='+cid+"&freeUser=1",
			buttons : [ {
				text : '确定',
				handler : function() {
					parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
					var f = parent.$.modalDialog.handler.find('#platformUserEditForm');
					f.submit();
				}
			} ]
		});
	}
	
	function editPlatformViewUser(id) {
		var cid=0;
		if (id == undefined) {
			var rows = platformUserlist.datagrid('getChecked');
			if (rows == "") {
				$.messager.alert('提示',"请选择要查看的用户！！");
				return;
			}
			if(rows.length>1){
				$.messager.alert('提示',"只能选择一个用户！！");
				return;
			}
			id = rows[0].uid;
			cid=rows[0].cid;
		} else {
			platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
		}
		parent.$.modalDialog({
			title : '查看',
			width : 400,
			height : 480,
			href : path +'/platform/user/viewUser?id=' + id+'&cid='+cid,
			buttons : [ {
				text : '关闭',
				handler : function() {
					parent.$.modalDialog.openner_dataGrid = platformUserlist;
                    parent.$.modalDialog.handler.dialog('close');
                    platformUserlist.datagrid('reload');
				}
			} ]
		});
	}
	
	function editPlatformViewfreeUser(id) {
		var cid=0;
		if (id == undefined) {
			var rows = platformUserlist.datagrid('getChecked');
			if (rows == "") {
				$.messager.alert('提示',"请选择要查看的用户！！");
				return;
			}
			if(rows.length>1){
				$.messager.alert('提示',"只能选择一个用户！！");
				return;
			}
			id = rows[0].uid;
			cid=rows[0].cid;
		} else {
			platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
		}
		parent.$.modalDialog({
			title : '查看',
			width : 400,
			height : 480,
			href : path +'/platform/user/viewUser?id=' + id+'&cid='+cid+"&freeUser=1",
			buttons : [ {
				text : '关闭',
				handler : function() {
					parent.$.modalDialog.openner_dataGrid = platformUserlist;
					parent.$.modalDialog.handler.dialog('close');
					platformUserlist.datagrid('reload');
				}
			} ]
		});
	}
	function changePasswordUserFun(id) {
        if (id == undefined) {
            var rows = platformUserlist.datagrid('getChecked');
            if (rows == "") {
    			$.messager.alert('提示',"请选择要修改密码的用户！！");
    			return;
    		}
            if(rows.length>1){
            	$.messager.alert('提示',"只能选择一个用户！！");
    			return;
            }
            id = rows[0].uid;
        } else {
            platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
        }
        parent.$.modalDialog({
            title : '修改密码',
            width : 500,
            height : 150,
            href : path +'/platform/user/changePwd?id=' + id,
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#changeUserPassword');
                    f.submit();
                }
            } ]
        });
    }
	function addUserFun() {
        parent.$.modalDialog({
            title : '新增用户',
            width : 500,
            height : 300,
            href : path +'/platform/user/addPage',
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#platformUserAddForm');
                    f.submit();
                }
            } ]
        });
    }
	function editPlatformUserAmountFun(id) {
        if (id == undefined) {
            var rows = platformUserlist.datagrid('getChecked');
            if (rows == "") {
    			$.messager.alert('提示',"请选择要加款/扣款的用户！！");
    			return;
    		}
            if(rows.length>1){
            	$.messager.alert('提示',"只能选择一个用户！！");
    			return;
            }
            id = rows[0].uid;
        } else {
            platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
        }
        parent.$.modalDialog({
            title : '加款/扣款 ',
            width : 500,
            height : 300,
            href : path +'/platform/user/editAmountPage?id=' + id,
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#amountEditForm');
                    $("#amountRecordType").val($("#amount_type").combobox("getText"));
                    if($("input[name='plusOrCharge']").val()==0&&$("#amount").val()>$("#wallet").val()){
                    	$.messager.alert('提示',"扣款金额不能超过用户当前余额！！");
                    }else{
                    	 f.submit();
                    }
                   
                }
            } ]
        });
    }
	
	function editCagentFun(id){
		var idStr="";
    	var cegent = "";
    	var agentName = "";
    	var cagentMember="";
		 if (id == undefined) {
            var rows = platformUserlist.datagrid('getChecked');
            if (rows == "") {
    			$.messager.alert('提示',"请选择修改的用户！！");
    			return;
    		}
            id = rows[0].uid;
            agentName = rows[0].topUidName;
            cegent = (rows[0].username).substring(0,3);
            loadCagentFun(rows[0].uid,agentName);
            var cusername = "";
            for(var i=0;i<rows.length;i++){
         	   cusername = (rows[i].username).substring(0,3);
         	   if(cegent.toLowerCase() !=cusername.toLowerCase()){
         			$.messager.alert('提示',"您选择的用户不属于同一个平台商！！");
         		    return; 
         	   }else{
         		   idStr=idStr+rows[i].uid;
         		   if(rows[i].topUidName == "" || rows[i].topUidName == null){
         			  cagentMember += "平台会员";
         		   }else{
         			  cagentMember += rows[i].topUidName;
         		   }
             	   if(i!=rows.length-1){
             		   idStr+=',';
             		  cagentMember+=',';
             	   }
         	   }
            }
        } else {
            platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
        }
		$('#memberId').val(idStr);
        $('#editCagent').dialog('open');
        $('#cagentMemberId').val(cagentMember);
	}
	
	function loadCagentFun(id,agentName){
		 $.ajax({
	            url:path +'/user/combobox?type=1&uid='+id,
	            type:'post',
	            async:true,
	            cache:false,
	            dataType :"json",
	            success:function(data) {
	                var htm = "<option value='0'>平台会员</option>";
	                for (var i = 0; i < data.length; i++) {
	                    htm += "<option value=" + data[i].id + ">" + data[i].loginName + "</option>";
	                }
	                $('#cagent_data').html(htm);
	                $('#cagent_data').combobox({});
	                $('#cagent_data').combobox('setText',agentName==null?'平台会员':agentName);
//	                $('#cagentMemberId').val(agentName==null?'平台会员':agentName);
	            }
			}); 
    	
    }
	function sendMessage(id){
        var rows = platformUserlist.datagrid('getChecked');
        if (rows == ""||rows.length==0) {
            $.ajax({
                url:path +'/platform/user/findByUser',
                type:'post',
                async:true,
                cache:false,
                dataType :"json",
                data:{
                	cagent:$("#combobox_cid").val()
                },
                success:function(data){
                    selectRow = data;
                }
            });
            $("#usernameSpan").html('全部');
   		}else{
            selectRow = rows;
            var username="";
            $.each(selectRow,function(i,item){
                username = username+item.username+',';
            });
            $("#usernameSpan").html(username.substr(0,username.length-1));
		}

		$('#sendMessageDiv').dialog('open');
		$("#gridTr").show();
	}
	
	function sendMessageAll(id){
		$.ajax({  
       	    url:path +'/platform/user/findByUser',   
            type:'post', 
            async:true, 
    		cache:false,
    		dataType :"json",
            success:function(data){ 
            	selectRow = data;
            }  
         }); 
		$('#sendMessageDiv').dialog('open');
		$("#gridTr").hide();
	}
	
	function sendMessageClick(){
		if($("#sendMess").val().length>100){
			$.messager.alert('提示',"发送的消息不能超过100字！！");
 			return;
		}
        progressLoad();
		var list=new Array();
		var addtime = new Date().format("yyyy-MM-dd 23:59:59");
		var message = $("#sendMess").val();
		$.each(selectRow,function(i,item){
			list.push({"uid":item.uid,"message":message});
		});
		$.ajax({
			url:path +'/platform/user/sendMessage',
			data: JSON.stringify(list),//将对象序列化成JSON字符串  
		    dataType:"json",  
		    contentType : 'application/json;charset=utf-8', //设置请求头信息  
			async:true,
			cache:false,
			success:function(data){
                	progressClose();
                    $('#sendMessageDiv').dialog('close');
                    parent.$.messager.alert('提示', data.msg, 'info');
	        }  	
			
		})
	}

 function confirmEdit(){
		 var memberId=$('#memberId').val();
        var userId= $('#cagent_data').combobox('getValue');
		$.ajax({
			url:path +'/platform/user/editCagent',
			type:'post',
			async:true,
			cache:false,
			dataType:'json',
			data:{
				memberId:memberId,
				userId:userId,
				cagentMemberId:$('#cagentMemberId').val()
			},
			success:function(data){ 
				
				if (data.success) {
					platformUserlist.datagrid('reload');
                    $('#editCagent').dialog('close');
                } else {
                    parent.$.messager.alert('提示', data.msg, 'info');
                }
	        }  	
			
		})
	}
	
    function searchPlatformUserFun() {
    	platformUserlist.datagrid('load', $.serializeObject($('#searchPlatformUserForm')));
    }
    
    
    
    function cleanPlatformUserFun() {
        $('#searchPlatformUserForm input').val('');
        
       //easyUI 设置选中的值请务必先设置setValue 并且要保证值在列表中部存在
        $('#querySelect').combobox('setValue', '');
        $('#querySelect').combobox('setText','用户名');
        $('#query_userStatus').combobox('setValue', '');
        $('#query_userStatus').combobox('setText','全部 ');
        platformUserlist.datagrid('load', {});
    }
    
    function numberToIp(number) { 
    	if(number=="null"||number==null){
    		return number;
    	}
    	if(number.indexOf(".")>0){
    		return number;
    	}
        var ip = "";  
        if(number <= 0) {  
            return ip;  
        }  
        var ip3 = (number << 0 ) >>> 24;  
        var ip2 = (number << 8 ) >>> 24;  
        var ip1 = (number << 16) >>> 24;  
        var ip0 = (number << 24) >>> 24  
          
        ip += ip3 + "." + ip2 + "." + ip1 + "." + ip0;  
          
        return ip;     
    }
    //会员打码量详情
    function reportSettlementDetailsFun(id) {
        parent.$.modalDialog({
            title : '详情',
            width : 800,
            height : (document.body.clientHeight*0.75),
            href : path +'/proxySettlement/queryByNoteSingle?uid=' + id,
            buttons : [ {
                text : '关闭',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = platformUserlist;
                    parent.$.modalDialog.handler.dialog('close');
                }
            } ]
        });
    }
    
    //查询用户游戏余额
    function gameBalanceFun(id,wallet) {

        parent.$.modalDialog({
            title : '详情',
            width : 600,
            height : (document.body.clientHeight*0.75),
            fit:false,
            href : path +'/proxySettlement/queryUserGamePage?uid=' + id+'&wallet='+wallet,
            buttons : [ {
                text : '关闭',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = platformUserlist;
                    parent.$.modalDialog.handler.dialog('close');
                    platformUserlist.datagrid('reload');
                }
            } ]
        });
    }
    //会员返水
function userTsFun(uid) {
    if (uid == undefined) {
        var rows = platformUserlist.datagrid('getChecked');
        if (rows == "") {
            $.messager.alert('提示',"请选择修改的用户！！");
            return;
        }
        uid='';
        for(var i=0;i<rows.length;i++){
            uid += rows[i].uid+",";
        }
        uid=uid.substring(0,uid.length-1);
    } else {
        platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
    }

    var time2 = new Date().format("yyyy-MM-dd");
    parent.$.modalDialog.openner_dataGrid = platformUserlist;
    parent.$.modalDialog({
        title : '会员返水',
        width : 700,
        height : (document.body.clientHeight*0.75),
        href : path +'/platform/user/userTs?startTime="2017-04-01"&endTime='+time2+'&uidStr=(' + uid+')',
        buttons : [ {
            text : '关闭',
            handler : function() {
                parent.$.modalDialog.handler.dialog('close');
            }
        } ]
    });
}

function selectUserDetailFun(uid) {
    if (uid == undefined) {
        var rows = platformUserlist.datagrid('getChecked');
        if (rows == "") {
            $.messager.alert('提示',"请选择修改的用户！！");
            return;
        }
        if(rows.length>1){
            $.messager.alert('提示',"只能选择一个用户！！");
            return;
		}
		uid=rows[0].uid;
    } else {
        platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
    }

    parent.$.modalDialog({
        title : '详情',
        width : 1100,
        height : (document.body.clientHeight*0.75),
        href : path +'/platform/user/selectUserDetailPage?uid=' + uid

    });
}

    //用户登录日志详情
    function userLoginRecordFun(id,username) {
        parent.$.modalDialog({
            title : username+'的登录记录(<font color="red">默认查询30天</font>)',
            width : 700,
            height : (document.body.clientHeight*0.75),
            href : path +'/userLogin/list?uid=' + id,
            buttons : [ {
                text : '关闭',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = platformUserlist;
                    parent.$.modalDialog.handler.dialog('close');
                }
            } ]
        });
    }
    function editUserTypeFun(id){
    	var idStr="";
    	var cegent = "";
	 	if (id == undefined) {
           var rows = platformUserlist.datagrid('getChecked');
           if (rows == "") {
   			$.messager.alert('提示',"请选择修改的用户！！");
   			return;
   			}
           /* if(rows.length>1){
           	$.messager.alert('提示',"只能选择一个用户！！");
   			return;
           } */
           id = rows[0].uid;
           cegent = (rows[0].username).substring(0,3);
           loadUserType(rows[0].cid,rows[0].typeId);
           var cusername = "";
           for(var i=0;i<rows.length;i++){
        	   cusername = (rows[i].username).substring(0,3);
        	   if(cegent.toLowerCase() !=cusername.toLowerCase()){
        			$.messager.alert('提示',"您选择的用户不属于同一个平台商！！");
        		    return; 
        	   }else{
        		   idStr=idStr+rows[i].uid;
            	   if(i!=rows.length-1){
            		   idStr+=',';
            	   }
        	   }
           }
       } else {
           platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
       }
	    $('#memberId').val(idStr);
		$('#editUserType').dialog('open');
	}
    
    function loadUserType(cid,typeId){
    	$.ajax({  
       	    url:path +'/userType/combobox?cid='+cid,   
            type:'post', 
            async:true, 
    		cache:false,
    		dataType :"json",
            success:function(data){ 
               var htm='';
               for(var i=0;i<data.length;i++){ 
            	   htm+="<option value="+data[i].id+">"+data[i].typename+"</option>";
               }
               $('#userType_data').html(htm);
               $('#userType_data').combobox({});
               $('#userType_data').combobox('setValue',typeId);
               $('#cagentTypeId').val(typeId);
            }  
         }); 
    	
    }
    
    function confirmEditUserType(){
		memberId=$('#memberId').val();
		userTypeId= $('#userType_data').combobox('getValue');
		cagentTypeId = $('#cagentTypeId').val();
		$.ajax({
			url:path +'/platform/user/editUserType',
			type:'post',
			async:true,
			cache:false,
			dataType:'json',
			data:{
				uidStr:memberId,
				typeId:userTypeId,
				cagentTypeId:cagentTypeId
			},
			success:function(data){ 
				
				if (data.success) {
					platformUserlist.datagrid('reload');
                    $('#editUserType').dialog('close');
                } else {
                    parent.$.messager.alert('错误', result.msg, 'error');
                }
	        }  	
			
		})
	}
    
	function addFundManageFun(id) {
        if (id == undefined) {
            var rows = platformUserlist.datagrid('getChecked');
            if (rows == "") {
    			$.messager.alert('提示',"请选择要加款/扣款的用户！！");
    			return;
    		}
            if(rows.length>1){
            	$.messager.alert('提示',"只能选择一个用户！！");
    			return;
            }
            id = rows[0].uid;
        } else {
            platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
        }
		
		parent.$.modalDialog({
					title : '手动加款',
					width : 600,
					height : 320,
					href : path +'/fundManage/addPage?uid='+id,
					buttons : [ {
						text : '添加',
						handler : function() {
                            $.messager.confirm("询问",'确认加款？',function(r){
                                if (r){
                                    parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                                    var f = parent.$.modalDialog.handler.find('#fundManageAddForm');
                                    f.submit();
                                }
                            });

						}
					} ]
				});
	}
	
	function addChargeFun(id) {
        if (id == undefined) {
            var rows = platformUserlist.datagrid('getChecked');
            if (rows == "") {
    			$.messager.alert('提示',"请选择要加款/扣款的用户！！");
    			return;
    		}
            if(rows.length>1){
            	$.messager.alert('提示',"只能选择一个用户！！");
    			return;
            }
            id = rows[0].uid;
        } else {
            platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
        }
		parent.$.modalDialog({
					title : '手动扣款',
					width : 600,
					height : 240,
					href : path +'/fundManage/addCharge?uid='+id,
					buttons : [ {
						text : '添加',
						handler : function() {
                            $.messager.confirm("询问",'确认扣款？',function(r){
                                if (r){
                                    parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                                    var f = parent.$.modalDialog.handler.find('#fundManageAddForm');
                                    f.submit();
                                }
                            });

						}
					} ]
				});
	}
	
	function addCJFun(id) {
        if (id == undefined) {
            var rows = platformUserlist.datagrid('getChecked');
            if (rows == "") {
    			$.messager.alert('提示',"请选择要加款/扣款的用户！！");
    			return;
    		}
            if(rows.length>1){
            	$.messager.alert('提示',"只能选择一个用户！！");
    			return;
            }
            id = rows[0].uid;
        } else {
            platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
        }
		parent.$.modalDialog({
					title : '赠送彩金',
					width : 600,
					height : 320,
					href : path +'/fundManage/addCJ?uid='+id,
					buttons : [ {
						text : '添加',
						handler : function() {
                            $.messager.confirm("询问",'确认赠送彩金？',function(r){
                                if (r){
                                    parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                                    var f = parent.$.modalDialog.handler.find('#fundManageAddForm');
                                    f.submit();
                                }
                            });
						}
					} ]
				});
	}
	
	function IPForbidden(loginIp,regIp){
		$.ajax({
			url:path +'/platform/user/ipForbidden',
			type:'post',
			async:true,
			cache:false,
			dataType:'json',
			data:{
				loginIp:loginIp,
				regIp:regIp
			},
			success:function(data){ 
				
				if (data.success) {
					/* platformUserlist.datagrid('reload');
                    $('#editUserType').dialog('close'); */
					parent.$.messager.alert('提示', '封禁成功', 'info');
                } else {
                    parent.$.messager.alert('错误', result.msg, 'error');
                }
	        }  	
			
		})
	}
	
// 	function showCapitalFlow(userName) {
//    	 var opts = {
//                 title : '会员资金流水',
//                 border : false,
//                 closable : true,
//                 fit : true,
//                 iconCls:'fi-torsos on'
//             };
   	 
//         opts.href = path +'/capitalFlow/getlist?urlUseraname='+userName;
//         window.parent.addTab(opts);
//    }

	function amountInfoFun(name){
	 	 parent.$.modalDialog({
            title : '资金流水',
            width : '1230',
            height : "600",
            href : path +'/capitalFlow/getlist?urlUseraname='+name
//             		 ,
//             buttons : [ {
//                 text : '确定',
//                 handler : function() {
//                     parent.$.modalDialog.openner_dataGrid = cagentList;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
//                     var f = parent.$.modalDialog.handler.find('#cagentAddForm');
//                     f.submit(); 
//                 }
//             } ] 
        }); 
        
		
	}

	
	//导出
	function btnExport(){
		
		
		parent.$.messager.confirm('询问', '是否导出所有数据？', function(b) {
            if (b) {
             	/* $("#qqq").html($("#searchPlatformUserForm").find("form"));
            	$("#qqq").submit(); 
            	 */
                 $("#searchPlatformUserForm").attr("action",path+"/platform/user/userExcel");
            	 $("#searchPlatformUserForm").submit(); 
            }
        });
	}
	function addAuditFundManage(id) {
		if (id == undefined) {
			var rows = platformUserlist.datagrid('getChecked');
			if (rows == "") {
				$.messager.alert('提示',"请选择要加款的用户！！");
				return;
			}
			if(rows.length>1){
				$.messager.alert('提示',"只能选择一个用户！！");
				return;
			}
			id = rows[0].uid;
		} else {
			platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
		}
		parent.$.modalDialog({
			title : '手动加款',
			width : 600,
			height : 380,
			href : path +'/tfundmanager/addPage?uid='+id,
			buttons : [ {
				text : '添加',
				handler : function() {
					$.messager.confirm("询问",'确认加款？',function(r){
						if (r){
							parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
							var f = parent.$.modalDialog.handler.find('#tfundmanagerAddForm');
							f.submit();
						}
					});

				}
			} ]
		});
	}

	function addAuditCharge(id) {
		if (id == undefined) {
			var rows = platformUserlist.datagrid('getChecked');
			if (rows == "") {
				$.messager.alert('提示',"请选择要扣款的用户！！");
				return;
			}
			if(rows.length>1){
				$.messager.alert('提示',"只能选择一个用户！！");
				return;
			}
			id = rows[0].uid;
		} else {
			platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
		}
		parent.$.modalDialog({
			title : '手动扣款',
			width : 600,
			height : 240,
			href : path +'/tfundmanager/addCharge?uid='+id,
			buttons : [ {
				text : '添加',
				handler : function() {
					$.messager.confirm("询问",'确认扣款？',function(r){
						if (r){
							parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
							var f = parent.$.modalDialog.handler.find('#tfundmanagerAddForm');
							f.submit();
						}
					});

				}
			} ]
		});
	}

	function addAuditCJ(id) {
		if (id == undefined) {
			var rows = platformUserlist.datagrid('getChecked');
			if (rows == "") {
				$.messager.alert('提示',"请选择要赠送彩金的用户！！");
				return;
			}
			if(rows.length>1){
				$.messager.alert('提示',"只能选择一个用户！！");
				return;
			}
			id = rows[0].uid;
		} else {
			platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
		}
		parent.$.modalDialog({
			title : '赠送彩金',
			width : 600,
			height : 320,
			href : path +'/tfundmanager/addCJ?uid='+id,
			buttons : [ {
				text : '添加',
				handler : function() {
					$.messager.confirm("询问",'确认赠送彩金？',function(r){
						if (r){
							parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
							var f = parent.$.modalDialog.handler.find('#tfundmanagerAddForm');
							f.submit();
						}
					});
				}
			} ]
		});
	}
	
	function addIntegral(id) {
        if (id == undefined) {
            var rows = platformUserlist.datagrid('getChecked');
            if (rows == "") {
    			$.messager.alert('提示',"请选择要修改积分的用户！！");
    			return;
    		}
            if(rows.length>1){
            	$.messager.alert('提示',"只能选择一个用户！！");
    			return;
            }
            id = rows[0].uid;
        } else {
            platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
        }
		
		parent.$.modalDialog({
					title : '修改积分',
					width : 600,
					height : 250,
					href : path +'/pluOrder/addIntegral?uid='+id,
					buttons : [ {
						text : '添加',
						handler : function() {
                            $.messager.confirm("询问",'确认修改积分？',function(r){
                                if (r){
                                    parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                                    var f = parent.$.modalDialog.handler.find('#pluOrderAddForm');
                                    f.submit();
                                }
                            });
						}
					} ]
				});
	}
	function makeupMoney(id,username,wallet) {
		if (id == undefined) {
			var rows = platformUserlist.datagrid('getChecked');
			if (rows == "") {
				$.messager.alert('提示',"请选择要修改金额的用户！！");
				return;
			}
			if(rows.length>1){
				$.messager.alert('提示',"只能选择一个用户！！");
				return;
			}
			id = rows[0].uid;
			username = rows[0].username;
			wallet = rows[0].wallet;
		} else {
			platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
		}
		
		parent.$.modalDialog({
			title : '修改金额',
			width : 600,
			height : 250,
			href : path +'/platform/user/makeupMoney?uid='+id+"&username="+username+"&wallet="+wallet,
			buttons : [ {
				text : '添加',
				handler : function() {
					$.messager.confirm("询问",'确认修改用户钱包金额？请谨慎操作！！',function(r){
						if (r){
							parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
							var f = parent.$.modalDialog.handler.find('#makeupMoneyForm');
							f.submit();
						}
					});
				}
			} ]
		});
	}
	
	function deleteIntegral(id) {
        if (id == undefined) {
            var rows = platformUserlist.datagrid('getChecked');
            if (rows == "") {
    			$.messager.alert('提示',"请选择要扣除积分的用户！！");
    			return;
    		}
            if(rows.length>1){
            	$.messager.alert('提示',"只能选择一个用户！！");
    			return;
            }
            id = rows[0].uid;
        } else {
            platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
        }
		
		parent.$.modalDialog({
					title : '扣除积分',
					width : 600,
					height : 250,
					href : path +'/pluOrder/deleteIntegral?uid='+id,
					buttons : [ {
						text : '扣除',
						handler : function() {
                            $.messager.confirm("询问",'确认扣除积分？',function(r){
                                if (r){
                                    parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                                    var f = parent.$.modalDialog.handler.find('#pluOrderAddForm');
                                    f.submit();
                                }
                            });

						}
					} ]
				});
	}
	//清空打码量
	function clearDml(uidStr) {
		if (uidStr == undefined) {
			var rows = platformUserlist.datagrid('getChecked');
			if (rows == "") {
				$.messager.alert('提示',"请选择需要清空的用户！！");
				return;
			}
            uidStr='';
			for(var i=0;i<rows.length;i++){
                uidStr += rows[i].uid+",";
			}
            uidStr=uidStr.substring(0,uidStr.length-1);
		} else {
			platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
		}

		$.messager.confirm("询问",'确认清空打码量？',function(r){
			if (r){
				$.ajax({
					url:path +'/platform/user/clearDml',
					type:'post',
					async:true,
					cache:false,
					dataType:'json',
					data:{
					    uidStr:uidStr
					},
					success:function(data){
                        if (data.success) {
                            parent.$.messager.alert('提示', '清空成功', 'info');
                        } else {
                            parent.$.messager.alert('错误', data.msg, 'error');
                        }
                    }

				})
			}
		});
	}
	
	function userGameStatus(uid){
		if (uid == undefined) {
			var rows = platformUserlist.datagrid('getChecked');
			if (rows == "") {
				$.messager.alert('提示',"请至少选择一个用户！！");
				return;
			}
			if(rows.length>1){
            	$.messager.alert('提示',"只能选择一个用户！！");
    			return;
            }
			uid = rows[0].uid;
		} else {
			platformUserlist.datagrid('unselectAll').datagrid('uncheckAll');
		}
		parent.$.modalDialog({
			title : '游戏状态详情',
			width : 600,
			height : 400,
			href : path +'/userGameStatus/gameStatus?uid='+uid,
			buttons : [ {
				text : '关闭',
				handler : function() {
                       parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                       parent.$.modalDialog.handler.dialog('close');
				}
			} ]
		});
	}
	function batchExportUser(){
        parent.$.modalDialog({
            title : '导入会员',
            width : 600,
            height : 250,
            href : path +'/platform/user/exportUserPage',
            buttons : [ {
                text : '确认导入',
                handler : function() {
						parent.$.modalDialog.openner_dataGrid = platformUserlist;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
						var f = parent.$.modalDialog.handler.find('#platformUserExportForm');
						f.submit();
                }
            } ]
        });
	}
	function batchTransfer(){
		$.messager.confirm("询问",'确认转出所有用户余额？',function(r){
			if (r){
		
				$.ajax({
					url:path +'/platform/user/batchTransfer',
					type:'post',
					async:true,
					cache:false,
					dataType:'json',
					data:{
					    startTime:null,
					    endTime:null,
					},
					success:function(data){
                        if (data.success) {
                            $.messager.alert('提示', '转账完毕', 'info');
                        } else {
                            $.messager.alert('错误', data.msg, 'error');
                        }
                    }

				})
			}
		});
	}