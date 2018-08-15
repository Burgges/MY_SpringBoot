package com.nick.controller;

<<<<<<< HEAD
import com.nick.dto.Producter;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> 068cb3f... Spring Boot 定时任务
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Created by Nick on 2018/7/14.
 *
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Value("${profiles.actives}")
    private String currentProfiles;

<<<<<<< HEAD
    @Autowired
    private Producter producter;

    @ApiOperation("获取当前环境")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(@RequestParam(value = "userName", required = false) String userName) {
=======
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
>>>>>>> 068cb3f... Spring Boot 定时任务
        return "Hello World! 当前环境是： " + currentProfiles;
    }


    @ApiOperation("发送消息")
    @RequestMapping(value = "/send-msg", method = RequestMethod.POST)
    public String sendMsg(@RequestParam(value = "msgKey") String msgKey,
                          @RequestParam(value = "msgValue") String msgValue) {
        producter.sendRedisMsg(msgKey, msgValue);
        return "消息发送成功";
    }



}
