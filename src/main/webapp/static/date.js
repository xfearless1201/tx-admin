var now = new Date(); //当前日期
var nowDayOfWeek = now.getDay(); //今天本周的第几天
var nowDay = now.getDate(); //当前日
var nowMonth = now.getMonth(); //当前月
var nowYear = now.getYear(); //当前年
nowYear += (nowYear < 2000) ? 1900 : 0; //
var lastMonthDate = new Date(); //上月日期
lastMonthDate.setDate(1);
lastMonthDate.setMonth(lastMonthDate.getMonth() - 1);
var lastYear = lastMonthDate.getYear();
var lastMonth = lastMonthDate.getMonth();
	

function yesterdayData(){ // 获取昨天的时间
    	 var day1 = new Date();
    	 var month;
    	 var day;
	   	 day1.setTime(day1.getTime()-24*60*60*1000);
	   	  
	   	
	   	 if(day1.getMonth()+1 <=9){
	   		month = day1.getMonth()+1;
	   		month = "0"+month;
	   	 }else{
	   		month = day1.getMonth()+1;
	   	 }
	   	 
	   	 if(day1.getDate()<=9){
	   		day = day1.getDate();
	   		day = "0"+day;
	   	 }else{
	   		day = day1.getDate();
	   	 }
	   	 
	   	 var s1 = day1.getFullYear()+"-" + (month) + "-" + day;
	   	 
	   	 

	   	$("#startTime").val(s1+" 00:00:00");

	   	$("#endTime").val(s1+" 23:59:59");
	   	searchFun();
	   	
}
 
 function sertFirstDay(){ // 获取本周的时间
    	var month;
    	var day;
   	    var Nowdate=new Date();     
   	    var WeekFirstDay;
   	    if(Nowdate.getDay()==0){
   	    	WeekFirstDay=new Date(Nowdate-6*86400000);
   	    }else{
   	    	WeekFirstDay=new Date(Nowdate-(Nowdate.getDay()-1)*86400000)
   	    }
   	    M=Number(WeekFirstDay.getMonth())+1;
   	    if(M<=9){
   	    	month =  M;
   	    	month = "0"+month;
   	    }else{
   	       month =  M;
   	    }
   	    if(WeekFirstDay.getDate()<=9){
   	    	day = WeekFirstDay.getDate();
   	    	day = "0"+day;
   	    }else{
   	    	day = WeekFirstDay.getDate();
   	    }
   		
   		$("#startTime").val(WeekFirstDay.getFullYear()+"-"+month+"-"+day+" 00:00:00");

   		showWeekLastDay();
 	
}

function showWeekLastDay(){   
	
	var month;
	var day;
    var Nowdate=new Date();     
    var WeekFirstDay;
    if(Nowdate.getDay()==0){
    	WeekFirstDay=new Date(Nowdate-6*86400000);
    }else{
    	WeekFirstDay=new Date(Nowdate-(Nowdate.getDay()-1)*86400000)
    }    
    var WeekLastDay=new Date((WeekFirstDay/1000+6*86400)*1000);
    
    M=Number(WeekLastDay.getMonth())+1;  
    
    if(M<=9){
    	month =  M;
    	month = "0"+month;
    }else{
       month =  M;
    }
    if(WeekLastDay.getDate()<=9){
    	day = WeekLastDay.getDate();
    	day = "0"+day;
    }else{
    	day = WeekLastDay.getDate();
    }
   $("#endTime").val(WeekLastDay.getFullYear()+"-"+month+"-"+day+" 23:59:59");
   searchFun();
}

function showMonthFirstDay(){ 
	
	var time_4 = new Date().format("yyyy-MM-01 00:00:00");
	var time_5 = new Date().format("yyyy-MM-dd 23:59:59");
	$("#startTime").val(time_4); 
	$("#endTime").val(time_5);
	searchFun();
}

function toDay(){ 
	var time_4 = new Date().format("yyyy-MM-dd 00:00:00");
	var time_5 = new Date().format("yyyy-MM-dd 23:59:59");
	$("#startTime").val(time_4); 
	$("#endTime").val(time_5);
	searchFun();
}

function getLastMonthStartDate() {
	var lastMonthStartDate = new Date(lastMonth==11?nowYear-1:nowYear, lastMonth, 1);
	
    $("#startTime").val(formatDate(lastMonthStartDate)+" 00:00:00");
    
    var lastMonthEndDate = new Date(lastMonth==11?nowYear-1:nowYear,lastMonth , getMonthDays(lastMonth));
    
    $("#endTime").val(formatDate(lastMonthEndDate)+" 23:59:59");
    
    searchFun();
}

function lastWeekFirstDay(){

	if(nowDayOfWeek==0) nowDayOfWeek=7;
    var weekStartDate = new Date(nowYear, nowMonth, nowDay - nowDayOfWeek - 6);
    var weekEndDate = new Date(nowYear, nowMonth, nowDay - nowDayOfWeek );
   
    $("#startTime").val(formatDate(weekStartDate)+" 00:00:00");
    $("#endTime").val(formatDate(weekEndDate)+" 23:59:59");
    searchFun();
}

function getMonthDays(myMonth) {
	
    var monthStartDate = new Date(nowYear, myMonth, 1);
    var monthEndDate = new Date(nowYear, myMonth + 1, 1);
    var days = (monthEndDate - monthStartDate) / (1000 * 60 * 60 * 24);
    return days;
}

function formatDate(date) {
    var myyear = date.getFullYear();
    var mymonth = date.getMonth()+1;
    var myweekday = date.getDate();

    if(mymonth < 10){
        mymonth = "0" + mymonth;
    }
    if(myweekday < 10){
        myweekday = "0" + myweekday;
    }
    return (myyear+"-"+mymonth + "-" + myweekday);
}