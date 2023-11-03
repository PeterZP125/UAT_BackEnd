package com.zp.uat.sys.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import lombok.Data;

import java.util.List;

/**
 * @author PeterZP
 * @create 2023-11-02 17:16
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
   /* protected long total;
    protected long size;
    protected long current;
    protected List<OrderItem> orders;
    protected boolean optimizeCountSql;
    protected boolean searchCount;
    protected boolean optimizeJoinOfCountSql;
    protected Long maxLimit;
    protected String countId;*/

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
//        fillFieldInfo(t);
    }


    public static <T> Result<T> success(T t) {
        return new Result<T>(t, RetCodeEnum.SUCCESS);
    }

    public static <T> Result<T> success() {
        return new Result<T>(RetCodeEnum.SUCCESS);
    }

    public static <T> Result<T> fail() {
        return new Result<T>(RetCodeEnum.FAIL);
    }

   /* @SuppressWarnings("unchecked")
    public void fillFieldInfo(T t){
        if(t instanceof ResultPage){
            ResultPage<T> resultPage = (ResultPage<T>) t;
            this.data = (T) resultPage.getRecords();
            this.current = resultPage.getCurrent();
            this.size = resultPage.getSize();
            this.total = resultPage.getTotal();
            this.orders = resultPage.orders();
            this.optimizeCountSql = resultPage.optimizeCountSql;
            this.searchCount = resultPage.searchCount;
            this.optimizeJoinOfCountSql = resultPage.optimizeJoinOfCountSql;
            this.maxLimit = resultPage.maxLimit();
            this.countId = resultPage.countId();
        }else{
            this.data = t;
        }
    }*/

}
