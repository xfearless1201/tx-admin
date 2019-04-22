package com.cn.tianxia.admin.commons.response;

/**
 * 
 * @ClassName ResultResponse
 * @Description 返回结果封装类
 * @author Hardy
 * @Date 2019年4月13日 下午7:08:53
 * @version 1.0.0
 */
public class ResultResponse {

    private int status;
    
    private String code;
    
    private String msg;
    
    private Object data;
    
    public ResultResponse(int status, String code, String msg) {
        super();
        this.status = status;
        this.code = code;
        this.msg = msg;
    }
    
    public ResultResponse(int status, String code) {
        super();
        this.status = status;
        this.code = code;
    }



    public ResultResponse(int status, String code, String msg, Object data) {
        super();
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public int getStatus() {
        return status;
    }

    
    public void setStatus(int status) {
        this.status = status;
    }

    
    public String getCode() {
        return code;
    }

    
    public void setCode(String code) {
        this.code = code;
    }

    
    public String getMsg() {
        return msg;
    }

    
    public void setMsg(String msg) {
        this.msg = msg;
    }

    
    public Object getData() {
        return data;
    }

    
    public void setData(Object data) {
        this.data = data;
    }
    
    public static ResultResponse success(String msg,Object data){
        return new ResultResponse(ResponseCode.SUCCESS_STATUS, ResponseCode.SUCCESS_CODE, msg, data);
    }
    
    public static ResultResponse success(){
        return new ResultResponse(ResponseCode.SUCCESS_STATUS, ResponseCode.SUCCESS_CODE);
    }
    
    public static ResultResponse faild(String msg){
        return new ResultResponse(ResponseCode.FAIL_STATUS, ResponseCode.FAIL_CODE, msg);
    }
    
    public static ResultResponse error(String msg){
        return new ResultResponse(ResponseCode.ERROR_STATUS, ResponseCode.ERROR_CODE, msg);
    }
    
    public static ResultResponse process(String msg){
        return new ResultResponse(ResponseCode.PROCESS_STATUS, ResponseCode.PROCESS_CODE, msg);
    }
}
