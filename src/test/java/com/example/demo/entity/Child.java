package com.example.demo.entity;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-06-21 09:24
 **/
public class Child {
    private String name;
    private Integer age;

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

    public Child(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Child() {
    }
}
