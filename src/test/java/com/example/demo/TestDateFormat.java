package com.example.demo;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: demo
 * @description: 测试日期类型转换
 * @author: Marcos-Lay
 * @create: 2019-08-02 17:33
 **/
public class TestDateFormat {
    @Test
    public void test(){
        try {
            String start = "2015-05-05";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
            Date parse = simpleDateFormat.parse(start);
            System.out.println(parse.toString());
        } catch (ParseException e) {
            System.out.println("时间类型转换异常");
        }
    }
}
