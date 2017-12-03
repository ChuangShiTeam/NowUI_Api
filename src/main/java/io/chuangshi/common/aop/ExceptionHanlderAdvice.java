package io.chuangshi.common.aop;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import io.chuangshi.common.result.ResultBean;

@RestControllerAdvice
public class ExceptionHanlderAdvice {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBean excpetion(Exception e, WebRequest request) {
        ResultBean result = ResultBean.handleException(e);
        return result;
    }
}
