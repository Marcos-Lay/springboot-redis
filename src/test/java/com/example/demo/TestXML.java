package com.example.demo;

import com.example.demo.entity.Child;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-06-21 09:28
 **/
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class TestXML {
    /*public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Child bean = classPathXmlApplicationContext.getBean(Child.class);
        System.out.println(bean.getName());
        System.out.println(bean.getAge());
    }*/
    @Resource
    private Child child;
    @Test
    public void test(){
        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
