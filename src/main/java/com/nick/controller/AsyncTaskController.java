package com.nick.controller;

import com.nick.service.impl.AsyncTaskServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 异步任务
 * Created by Nick on 2018/8/21.
 */
@RestController
@RequestMapping("/async")
//@EnableAsync
public class AsyncTaskController{

    @Resource
    private AsyncTaskServiceImpl asyncTaskService;

    @ApiOperation("异步任务")
    @RequestMapping(value = "/task", method = RequestMethod.GET)
    public String asyncTask() {

        asyncTaskService.asyncTaskFun1();
        asyncTaskService.asyncTaskFun2();
        asyncTaskService.asyncTaskFun3();

        return "任务正在处理中。。。";
    }


}
