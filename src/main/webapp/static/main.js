var imgtype="1";
var imgid="";
var qrcode = $('#qrcode').val();
$(function  () {
	$('.tree_item ').on('click',function  () {
		$('.tree_item ').css({'backgroundColor':'#e4e4e4','color':'black'})
		$(this).css({
			'backgroundColor':'#38c',
			'color':'#fff'
		})
	})
	var judge_bol = false;
	$('.img_list li').live('click',function  () {
		if(judge_bol){return}
		judge_bol = true;
		$('.img_list li').find('.img_detail').css('background','#e9e9e9');
		$(this).find('.img_detail').css('background','#38c'); 
		$('.img_operation').show();
		judge_bol = false;
	})
	 
		$.ajax({
			type:"post",
			url:path+"/ImgFile/getType",
			async:true,
			cache:false,
			data:{
				qrcode:$('#qrcode').val()
			},
			dataType :"json",
			success:function  (data) {
				$("#typelist").html("");
				for(var i=0,l=data.length;i<l;i++){
					$("#typelist").append("<li class='tree_item li_font' onclick='getimg("+data[i].type+")'>"+data[i].typename+"</li>");
				}
			}
		}); 
	getimg(imgtype);
})

function flushimg(){
	getimg(imgtype);
}

function getimg(id){
	imgtype=id;
	$.ajax({
		type:"get",
		url:path+"/ImgFile/getPicByType",
		async:false,
		cache:false,  
		dataType :"json",
		data:{
			typeid:id,
			qrcode:qrcode
		},
		success:function  (data) {
			$("#imglist").html("");
			var str='';
			for(var i=0,l=data.length;i<l;i++){  
				str='<li id="'+data[i].imgname.replace(".", "")+'" style="width: 150px;height: 150px;" onclick="getsrc(&apos;'+data[i].src+'&apos; , &apos; '+data[i].imgname+'&apos; , &apos; '+data[i].id+'&apos;)">'+
					'<img src="'+data[i].src+'"/>'+
						'<div class="img_detail"> <h2>'+data[i].imgname+'</h2> <p>'+Format_cov(data[i].addtime.time)+'<br />'+data[i].size+'</p></div></li>';
				$("#imglist").append(str);
			}
		}
	}); 
}

//时间格式转换
function Format_cov(time) {
    var date = new Date(time);
    Y = date.getFullYear() + '-';
    M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
    D = date.getDate() + ' ';
    h = (date.getHours()<10? '0'+ date.getHours():date.getHours())+ ':';
    m = (date.getMinutes()<10?'0'+date.getMinutes():date.getMinutes()) + ':';
    s = (date.getSeconds()<10?'0'+date.getSeconds():date.getSeconds());
    var fommat_time = Y + M + D + h + m + s;
    return fommat_time;
} 

function getsrc(src,name,id)
{  
	imgid=id;
	if(type=="img1"){
		window.opener.getretsrc1(src,name); 
	}else if (type="img2"){
		window.opener.getretsrc2(src,name); 
	}
}

function openfile(){ 
	 $('#file').trigger('click');
} 
function autosub(){ 
   	var ext = '.jpg.jpeg.gif.bmp.png.';
 	    var obj=$("#file");
 	    var f=$("#file").val();
 	    var tfname=$("#file").val(); 
 		var sno=tfname.lastIndexOf("\\");
 		tfname="#"+tfname.substr(sno+1).replace(".", ""); 
 		if (f== "") {//先判断是否已选择了文件  
 			return false; 
 		}
 		f = f.substr(f.lastIndexOf('.') + 1).toLowerCase();
 		if (ext.indexOf('.' + f + '.') == -1) {
 			alert("文件格式不正确");
 			return false; 
 		}   
 		
 		var file = document.getElementById("file");
 		var fileInfo = file.files[0]; 
 		if (fileInfo.size > 2048*1024) {
 			alert("文件大小超过2MB,请重新选择图片");
 			return false; 
 		}
 		$("#mtypeid").val(imgtype); 
		    var options = {  	
		    	 url: path+"/ImgFile/upload?mtypeid="+imgtype+"&cagent="+$('#cagent').val()+"&qrcode="+$('#qrcode').val(),
				 dataType: 'json', 
				 contentType: "application/json; charset=utf-8",    
				 success: function(data) {  
					 getimg(imgtype);
					$(tfname).trigger('click'); 
					 //$('.img_list li').find('.img_detail').css('background','#e9e9e9');
					//$(tfname).find('.img_detail').css('background','#38c'); 
		         },error: function(data){
		        	 getimg(imgtype);
		         }   
		    };    
		    // 提交表单   
		    $('#uploadForm').ajaxSubmit(options);
   }
function delpic(){ 
	if(imgid==""){
		alert("请选择图片");
		 return false;  
	}
	var gnl=confirm("确认删除该图片");  
	if (gnl==true){  
		$.ajax({
            type: "GET",
            url: path+"/ImgFile/DelPic",
            data: {
            	id:imgid,
            	typeid:imgtype
            },
            dataType: "json",
            success: function(data){ 
            	getimg(imgtype);
            },error:function(data){ 
            	getimg(imgtype);
            }
        });
	}else{  
	  return false;  
	}   
}

function success(){  
	if(imgid==""){
		alert("请选择图片");
		 return false;  
	}
	window.close();
}
