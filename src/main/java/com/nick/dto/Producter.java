package com.nick.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 消息生产者
 * Created by Nick on 2018/8/12.
 */
@Component
public class Producter {

    private static final Logger LOGGER = LoggerFactory.getLogger(Producter.class);

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void sendRedisMsg(String msgKey, String msgValue) {
        LOGGER.info("发送的消息为： <" + msgKey + "," + msgValue + ">");
        redisTemplate.convertAndSend(msgKey, msgValue);
    }

}
