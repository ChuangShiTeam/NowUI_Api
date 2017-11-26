package io.chuangshi.common.aop;

import io.chuangshi.common.result.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionHanlderAdvice {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBean excpetion(Exception e, WebRequest request) {
        ResultBean result = ResultBean.handleException(e);
        return result;
    }
}
