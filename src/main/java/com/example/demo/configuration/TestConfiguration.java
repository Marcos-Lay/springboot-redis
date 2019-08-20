package com.example.demo.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: demo
 * @description: 测试configruation
 * @author: Marcos-Lay
 * @create: 2019-07-18 11:52
 **/
@Configuration
public class TestConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(TestConfiguration.class);
    @Bean
    public void test(){
        logger.info("1111111111111111111");
    }
}
