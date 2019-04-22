Date.prototype.format = function(fmt) {
	var o = {
		"M+" : this.getMonth() + 1, //月份 
		"d+" : this.getDate(), //日 
		"h+" : this.getHours(), //小时 
		"m+" : this.getMinutes(), //分 
		"s+" : this.getSeconds(), //秒 
		"q+" : Math.floor((this.getMonth() + 3) / 3), //季度 
		"S" : this.getMilliseconds()
	//毫秒 
	};
	if (/(y+)/.test(fmt)) {
		fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "")
				.substr(4 - RegExp.$1.length));
	}
	for ( var k in o) {
		if (new RegExp("(" + k + ")").test(fmt)) {
			fmt = fmt.replace(RegExp.$1,
					(RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k])
							.substr(("" + o[k]).length)));
		}
	}
	return fmt;
}
//获取七天前的日期
 function beforeSevenData(myDate){
	//设置日期，当前日期的前七天
	myDate.setDate(myDate.getDate() - 7);
	var dateArray = []; 
	var dateTemp; 
	var flag = 1; 
	for (var i = 0; i < 7; i++) {
	    dateTemp = (myDate.getMonth()+1)+"-"+myDate.getDate();
	    dateArray.push(dateTemp);
	    myDate.setDate(myDate.getDate() + flag);
	}
	return dateArray;
}