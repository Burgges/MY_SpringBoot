package com.nick.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * 多线程定时任务配置类
 *
 * @Description 由于SchedulingConfigurer默认是单线程来执行定时任务，所以重写其配置方法，实现多线程
 *
 * Created by Nick on 2018/7/15.
 *
 */
@Configuration
public class ScheduledTaskConfig implements SchedulingConfigurer {

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.setScheduler(Executors.newScheduledThreadPool(20));
    }
}
