package com.example.demo;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-05-28 19:30
 **/
public class Feibonaqie {
    public static void main(String[] args) {
        System.out.println("第20项斐波那契数列的值为："+fibonacci(10000));
     }
     public static long fibonacci(int n){
         int[] result={0,1};
         if(n<2)
             return result[n];
         long fibNMinusOne=1;
         long fibNMinusTwo=0;
         long fibN=0;
         for(int i=2;i<=n;i++){
             fibN=fibNMinusOne+fibNMinusTwo;
              fibNMinusTwo=fibNMinusOne;
             fibNMinusOne=fibN;
         }
         return fibN;
     }
}
