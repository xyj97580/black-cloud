package com.xyj.cloud.job;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by xyj97 on 2018/10/23.
 */

@Configuration
//@EnableScheduling
public class SchedulingConfig {

    /**
     * 线程池多个线程同时执行，SchedulingConfigurer默认是串行的，原理是TaskScheduler是否为空，因此配置taskScheduler更改默认配置
     * @return
     */
    @Bean
    public TaskScheduler taskScheduler() {
        return new ConcurrentTaskScheduler(Executors.newScheduledThreadPool(5));
    }
}
