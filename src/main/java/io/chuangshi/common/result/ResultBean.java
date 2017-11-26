package io.chuangshi.common.result;


import io.chuangshi.common.exception.KnownException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {

    private static Logger logger = LoggerFactory.getLogger(ResultBean.class);

    private static final long serialVersionUID = 1L;

    public static final String SUCCESS = "200";
    public static final String CLIENT_FAIL = "400";
    public static final String SERVER_FAIL = "500";

    private String code = SUCCESS;
    private String msg = "success";
    private T data;

    public ResultBean() {
    }

    public ResultBean(String code, String msg, T data) {
        init(code, msg, data);
    }

    public ResultBean(T data) {
        this.data = data;
    }

    public ResultBean(Throwable e) {
        init(SERVER_FAIL, e.getMessage(), null);
    }

    public void init(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResultBean handleException(Throwable e) {
        if (e instanceof KnownException) {
            return new ResultBean<>(((KnownException) e).getCode(), e.getMessage(), null);
        } else {
            logger.info("from ResultBean", e);
            return new ResultBean<>(e);
        }
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
