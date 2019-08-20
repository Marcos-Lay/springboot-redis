package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-07-08 10:17
 **/
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpring {
    //加载单个配置文件
    @Test
    public void test1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
    }
    //加载多个配置文件
    @Test
    public void test2(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml","application1.xml");
    }
    //加载配置文件，并指定是否加载上下文
    @Test
    public void test3(){
        String[] a = {"application.xml","application1.xml"};
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(a,true);
    }
}
