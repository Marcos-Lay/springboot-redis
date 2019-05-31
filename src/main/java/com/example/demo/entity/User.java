package com.example.demo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-05-23 17:21
 **/
@Data
public class User implements Serializable {
    @Id
    private int id;

    private String name;
    //@TableField(strategy = FieldStrategy.IGNORED)
    private String name1;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
    //@TableField(strategy = FieldStrategy.IGNORED)
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
