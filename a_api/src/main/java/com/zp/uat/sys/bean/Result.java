package com.zp.uat.sys.bean;

import lombok.Data;

/**
 * @author PeterZP
 * @create 2023-11-02 17:16
 */
@Data
public class Result<T>{
    private Integer code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(RetCodeEnum retCodeEnum) {
        this.code = retCodeEnum.getCode();
        this.msg = retCodeEnum.getMsg();
    }

    public Result(T t, RetCodeEnum retCodeEnum) {
        this.code = retCodeEnum.getCode();
        this.msg = retCodeEnum.getMsg();
        this.data = t;
    }


    public static <T> Result<T> success(T t) {
        return new Result<T>(t, RetCodeEnum.SUCCESS);
    }

    public static <T> Result<T> success() {
        return new Result<T>(RetCodeEnum.SUCCESS);
    }

}
