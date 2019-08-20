package com.example.demo;

import java.util.Scanner;

/**
 * @program: demo
 * @description: 提出字符串中的数相加
 * @author: Marcos-Lay
 * @create: 2019-06-03 15:04
 **/
public class TestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int result = 0;
        for (int i = 0; i < line.length(); i++) {
            if (Character.isDigit(line.charAt(i))) {
                result = result + Integer.parseInt(line.charAt(i) + "");
            }
        }
        System.out.print(result);
    }
}

