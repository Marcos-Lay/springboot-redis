package com.example.demo.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-05-28 11:48
 **/
@Component
public class TimerTask {
    @Scheduled(cron = "0/5 * * * * ?")
    public void test(){
        System.out.println(System.currentTimeMillis());
    }
}
