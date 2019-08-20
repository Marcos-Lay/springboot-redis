package com.example.demo.entity;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-06-21 09:23
 **/
public class Parent {
    private String name;
    private Integer age;

    public Parent(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Parent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
