package com.example.demo;

import com.example.demo.entity.Parent;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-06-21 09:47
 **/
public class TestParent {
    @Resource(name = "parent")
    private Parent parent;
    public void test(){

    }
}
