package com.zp.uat.sys.bean;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @author PeterZP
 * @create 2023-11-02 18:09
 */
public class RetPage<T> extends Page<T> {

    public RetPage() {

    }

    public RetPage(long current, long size) {
        super(current, size);
    }
}
