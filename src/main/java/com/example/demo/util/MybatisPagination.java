package com.example.demo.util;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-05-27 10:08
 **/
@EnableTransactionManagement
@Configuration
@MapperScan("com.example.demo.mapper")
public class MybatisPagination {
    /**
    * @Description: 分页插件
    * @Param:
    * @return:
    * @Author: Marcos-Lay
    * @Date: 2019/5/27
    */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
