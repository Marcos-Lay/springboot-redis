package com.example.demo;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-06-27 16:33
 **/
public class TestSwitch {
    public static void main(String[] args) {
        String param = "null";
        switch (param) {
            case "null":
                System.out.println("null");
                break;
            default:
                System.out.println("default");
        }
    }
}

