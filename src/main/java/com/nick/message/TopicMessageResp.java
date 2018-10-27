package com.nick.message;

/**
 * 广播式消息响应体
 * Created by Nick.Chen on 2018/10/17 0017.
 */
public class TopicMessageResp {

    private String respMsg;

    public TopicMessageResp(String respMsg) {
        this.respMsg = respMsg;
    }

    public String getRespMsg() {
        return respMsg;
    }
}
