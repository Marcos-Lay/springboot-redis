package com.example.demo;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-07-04 14:28
 **/
public class TestThread implements Runnable{
        public static void main(String args[]) {
            TestThread mt = new TestThread();
            Thread t1 = new Thread(mt, "t1");
            Thread t2 = new Thread(mt, "t2");
            Thread t3 = new Thread(mt, "t3");
            Thread t4 = new Thread(mt, "t4");
            Thread t5 = new Thread(mt, "t5");
            Thread t6 = new Thread(mt, "t6");
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            t6.start();
        }
        public void run() {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName());
            }
        }
}
