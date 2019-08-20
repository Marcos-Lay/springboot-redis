package com.example.demo;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-06-03 11:53
 **/
public class TestRunnable {
    private static int count = 0;
    public static void main(String[] args) throws Exception {
        long a = System.currentTimeMillis();
        Runnable task = new Runnable() {
            public void run() {
                for (int i = 0; i < 5000000; ++i) {
                    synchronized (this){
                        count += 1;
                    }
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count = " + count);
        System.out.println(System.currentTimeMillis()-a);
    }
}
