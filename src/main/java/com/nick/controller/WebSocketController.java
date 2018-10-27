package com.nick.controller;

import com.nick.dto.RegisterFormDto;
import com.nick.message.TopicMessage;
import com.nick.message.TopicMessageResp;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * WebSocket控制器
 * Created by Nick.Chen on 2018/10/17 0017.
 */
@Controller
//@RequestMapping("/web-socket")
public class WebSocketController {

    @GetMapping("/topic-page")
    public String toRegisterPage() {
        return "websocket/webSocket";
    }

    /**
     * 广播式消息
     * @param topicMessage 消息体
     * @return 消息响应体
     * @throws Exception 异常
     */
    @MessageMapping("/topic") // 类似@RequestMapping
    @SendTo("/topic/getResponse") // 当服务端有消息时，会想该地址，发送消息
    public TopicMessageResp topicTest(TopicMessage topicMessage) throws Exception{
//        Thread.sleep(3000);
        return new TopicMessageResp("Hello world!" + topicMessage);
    }
}
