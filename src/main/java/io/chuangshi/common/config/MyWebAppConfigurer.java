package io.chuangshi.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import io.chuangshi.common.interceptor.AuthVerifyInterceptor;

@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
    
    @Bean
    public AuthVerifyInterceptor authVerifyInterceptor() {
        return new AuthVerifyInterceptor();
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(new AuthVerifyInterceptor()).addPathPatterns("/*");
        
        super.addInterceptors(registry);
    }

}
