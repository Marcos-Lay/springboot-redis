package com.example.demo;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-06-20 15:44
 **/
public class TestFormat {
    public static void main(String[] args) {
        String a = "com:shuncom:led3:%s";
        String b = "2";
        String format = String.format(a, b);
        System.out.println(format);
    }
}
