package com.example.demo.common;

/**
 * Created by XHJ on 2018/3/7.
 * 状态
 */
public enum  ResponseCode {
    //成功
    SUCCESS(0, "SUCCESS"),
    //错误
    ERROR(1, "ERROR"),
    //需要登录
    NEED_LOGIN(10, "需要登陆");

    private int code;
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
