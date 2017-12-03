package io.chuangshi.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import io.chuangshi.common.constant.Constant;
import io.chuangshi.common.util.HttpUtil;


/**
 * 权限拦截器
 * @author marcus
 *
 */
public class AuthVerifyInterceptor implements HandlerInterceptor {

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handle, Exception execption)
            throws Exception {
        // TODO Auto-generated method stub
        
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handle, ModelAndView mv)
            throws Exception {
        // TODO Auto-generated method stub
        
    }

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handle) throws Exception {
        String request_app_id = request.getHeader("");
        String http_platform = request.getHeader(Constant.PLATFORM);
        String http_version = request.getHeader(Constant.VERSION);
        String http_token = request.getHeader(Constant.TOKEN);
        String http_ip_address = HttpUtil.getIpAddress(request);
        System.out.println("测试");
        return true;
    }

}
