package io.chuangshi.common.config;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.baomidou.mybatisplus.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.plugins.parser.ISqlParser;

@EnableTransactionManagement
@Configuration
@MapperScan("io.chuangshi.**.mapper")
public class MybatisPlusConfig {
    
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    /**
     * mybatis-plus SQL执行效率插件【生产环境可以关闭】
     */
    @Bean
    @Profile({"dev","test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        
        performanceInterceptor.setMaxTime(1000); //maxTime SQL 执行最大时长，超过自动停止运行，有助于发现问题
        performanceInterceptor.setFormat(true); //format SQL SQL是否格式化，默认false
        
        return performanceInterceptor;
    }

    /**
     * mybatis-plus分页插件<br>
     * 文档：http://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setLocalPage(true);// 开启 PageHelper 的支持
        /*
         * 【测试多租户】 SQL 解析处理拦截器<br>
         * 这里固定写成住户 1 实际情况你可以从cookie读取，因此数据看不到 【 麻花藤 】 这条记录（ 注意观察 SQL ）<br>
         */
        List<ISqlParser> sqlParserList = new ArrayList<>();
        /*TenantSqlParser tenantSqlParser = new TenantSqlParser();
        tenantSqlParser.setTenantHandler(new TenantHandler() {
            @Override
            public Expression getTenantId() {
                return new LongValue(1L);
            }

            @Override
            public String getTenantIdColumn() {
                return "tenant_id";
            }

            @Override
            public boolean doTableFilter(String tableName) {
                // 这里可以判断是否过滤表
                
                if ("user".equals(tableName)) {
                    return true;
                }
                return false;
            }
        });


        sqlParserList.add(tenantSqlParser);*/
        paginationInterceptor.setSqlParserList(sqlParserList);
        /*paginationInterceptor.setSqlParserFilter(new ISqlParserFilter() {
            @Override
            public boolean doFilter(MetaObject metaObject) {
                MappedStatement ms = PluginUtils.getMappedStatement(metaObject);
                // 过滤自定义查询此时无租户信息约束【 麻花藤 】出现
                if ("UserMapper.selectListBySQL".equals(ms.getId())) {
                    return true;
                }
                return false;
            }
        });*/
        return paginationInterceptor;
    }

}
