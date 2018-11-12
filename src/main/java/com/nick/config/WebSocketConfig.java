package com.nick.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * WebSocket 配置类
 *
 * 1. 广播式
 * 2. 点对点式（聊天）
 *
 * Created by Nick.Chen on 2018/10/17 0017.
 */
//@Configuration
//@EnableWebSocketMessageBroker //开启使用STOMP协议来传输基于代理的消息（message broker）
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    /*@Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }*/


    /**
     * 配置消息代理（Message Broker）
     * @param registry 消息代理注册
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //配置/topic的广播式消息代理
        registry.enableSimpleBroker("/topic");
    }

    /**
     * 注册STOMP协议的节点，并映射制定的url
     * @param registry 注册实体
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // 注册节点，并指定使用sockJs协议
        registry.addEndpoint("/endpointTopic").withSockJS();
    }
}
