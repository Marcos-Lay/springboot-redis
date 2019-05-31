package com.example.demo;

/**
 * @program: demo
 * @description: 异或算法
 * @author: Marcos-Lay
 * @create: 2019-05-30 11:33
 **/
public class TestYH {
    public static void main(String[] args)
    {

        int[] array = {1,2,3,4,5,6,7,8,9,11,21,33,4,44};

        int index1 = (int)(Math.random()*11);
        int index2 = (int)(Math.random()*11);
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        int v = 0;
        for (int i = 0;i < array.length;i++) {
            v ^= array[i];
        }
        System.out.println("重复的数是:" + v);
    }
}
