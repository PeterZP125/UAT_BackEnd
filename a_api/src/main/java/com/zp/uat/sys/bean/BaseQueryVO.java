package com.zp.uat.sys.bean;

import lombok.Data;

/**
 * @author PeterZP
 * @create 2023-11-02 17:10
 */
@Data
public class BaseQueryVO {
    /*每页条数*/
    private Long size = 10L;

    /*当前页数*/
    private Long current = 1L;
}
