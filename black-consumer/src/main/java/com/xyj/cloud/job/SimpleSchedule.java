package com.xyj.cloud.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by xyj97 on 2018/10/23.
 */

@Component
public class SimpleSchedule {

//    @Scheduled(cron = "0/5 * * * * *")
    public void executeTash() {
        long thread = Thread.currentThread().getId();
        System.out.println("simpleSchedule threadId = " + thread + "runing");
    }
}
