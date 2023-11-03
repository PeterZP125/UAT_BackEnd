package com.zp.uat.sys.bean;

import lombok.Getter;

/**
 * @author PeterZP
 * @create 2023-11-02 17:22
 */
@Getter
public enum RetCodeEnum {

    SUCCESS(200, "success"),
    FAIL(400, "failed");

    private Integer code;
    private String msg;

    RetCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
