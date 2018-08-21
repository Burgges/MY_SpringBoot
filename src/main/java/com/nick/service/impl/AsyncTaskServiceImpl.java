package com.nick.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步任务
 * Created by Nick on 2018/8/21.
 */
@Service("asyncTaskService")
public class AsyncTaskServiceImpl {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncTaskServiceImpl.class);

    @Async //异步注解
    public void asyncTaskFun1() {

        Long startTime = System.currentTimeMillis();
        for (int index = 1; index <= 1; index ++) {
            LOGGER.info("第<" + index + ">次异步任务测试001");
        }
        LOGGER.info("任务1执行时间为： " + (System.currentTimeMillis() - startTime));
    }

    @Async
    public void asyncTaskFun2() {

        Long startTime = System.currentTimeMillis();
        for (int index = 1; index <= 1; index ++) {
            LOGGER.info("第<" + index + ">次异步任务测试002");
        }
        LOGGER.info("任务2执行时间为： " + (System.currentTimeMillis() - startTime));
    }

    @Async
    public void asyncTaskFun3() {

        Long startTime = System.currentTimeMillis();
        for (int index = 1; index <= 1; index ++) {
            LOGGER.info("第<" + index + ">次异步任务测试003");
        }
        LOGGER.info("任务3执行时间为： " + (System.currentTimeMillis() - startTime));
    }

}
