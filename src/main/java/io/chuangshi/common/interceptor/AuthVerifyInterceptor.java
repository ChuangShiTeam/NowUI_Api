package io.chuangshi.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import io.chuangshi.common.constant.Constant;
import io.chuangshi.common.util.HttpUtil;


/**
 * 接口权限拦截器
 * @author marcus
 *
 */
@Component
public class AuthVerifyInterceptor extends HandlerInterceptorAdapter {

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handle) throws Exception {
        String request_app_id = request.getHeader(Constant.APP_ID);
        String http_platform = request.getHeader(Constant.PLATFORM);
        String http_version = request.getHeader(Constant.VERSION);
        String http_token = request.getHeader(Constant.TOKEN);
        String http_ip_address = HttpUtil.getIpAddress(request);
        System.out.println("测试");
        return true;
    }
    

}
