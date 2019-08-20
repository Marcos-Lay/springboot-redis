package com.example.demo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-07-12 11:15
 **/
public class TestHashMap {
    @Test
    public void test1() {
        Map<Object, Object> map = new HashMap<>(2000000);
        Long start = System.currentTimeMillis();
        for (int i = 0; i < Math.pow(2, 20); i++) {
            map.put(i, i);
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
