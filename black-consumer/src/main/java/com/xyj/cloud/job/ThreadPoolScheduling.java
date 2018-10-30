package com.xyj.cloud.job;

import com.google.common.base.Function;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by xyj97 on 2018/10/23.
 */

@Component
public class ThreadPoolScheduling implements SchedulingConfigurer{

    public void myTask() {
        try {
            Thread.sleep(6000);
            System.out.println("ThreadId: " + Thread.currentThread().getId() +" ----- is running ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        List<String> li = new ArrayList<>();
        scheduledTaskRegistrar.addTriggerTask( this::myTask
        , triggerContext ->  {
            Date date = new CronTrigger("0/5 * * * * *").nextExecutionTime(triggerContext);
            return date;
        });
    }
}
