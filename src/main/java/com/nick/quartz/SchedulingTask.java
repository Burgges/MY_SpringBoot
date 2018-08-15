package com.nick.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Spring Boot 定时任务
 * 单线程执行
 * Created by Nick on 2018/7/14.
 *
 */
@Component
public class SchedulingTask {

    private final static Logger LOGGER = LoggerFactory.getLogger(SchedulingTask.class);

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private int fixedDelayCount = 1;
    private int fixedRateCount = 1;
    private int initialDelayCount = 1;
    private int cronCount = 1;

    /**
     * 服务启动成功后，按照设定的时间延迟执行
     */
    @Scheduled(fixedDelay = 2000)
    public void fixedDelayTask() {
        LOGGER.info("fixedDelayTask： 第{}次执行fixedDelayTask方法,执行时间为("+ simpleDateFormat.format(new Date()) +") ", fixedDelayCount++);
    }

    /**
     * 服务启动成功后，按照设定的时间延迟执行
     */
    @Scheduled(fixedRate = 5000)
    public void fixedRateTask() {
        LOGGER.info("fixedRateTask： 第{}fixedRateTask,执行时间为("+ simpleDateFormat.format(new Date()) +") ", fixedRateCount++);
    }

    /**
     *
     */
    @Scheduled(initialDelay = 2000, fixedRate = 5000)
    public void initialDelayTask() {
        LOGGER.info("initialDelayTask： 第{}initialDelayTask,执行时间为("+ simpleDateFormat.format(new Date()) +") ", initialDelayCount++);
    }

    /**
     * 根据cron表达式执行定时任务
     */
    @Scheduled(cron = "0/20 * * * * ?")
    public void cronTask() {
        LOGGER.info("cronyTask： 第{}cronTask,执行时间为("+ simpleDateFormat.format(new Date()) +") ", cronCount++);
    }
}
