package com.example.demo;

import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-05-27 16:47
 **/
public class RandomName {
    public static void main(String[] args) {
        /**随机产生100个昵称*/
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < 10; i++) {
            String chineseName = getRandomJianHan(3);
            if (!set.contains(chineseName)) {
                set.add(chineseName);
            }
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.err.print(iterator.next() + "\n");
        }

    }
    /**方法1*/
    public static String getRandomJianHan(int len) {
        String randomName = "";
        for (int i = 0; i < len; i++) {
            String str = null;
            int hightPos, lowPos; // 定义高低位
            Random random = new Random();
            hightPos = (176 + Math.abs(random.nextInt(39))); // 获取高位值
            lowPos = (161 + Math.abs(random.nextInt(93))); // 获取低位值
            byte[] b = new byte[2];
            b[0] = (new Integer(hightPos).byteValue());
            b[1] = (new Integer(lowPos).byteValue());
            try {
                str = new String(b, "GBK"); // 转成中文
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            randomName += str;
        }
        return randomName;
    }
}
