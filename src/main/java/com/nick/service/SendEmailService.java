package com.nick.service;

/**
 * 发送邮件接口
 * Created by Nick on 2018/8/19.
 */
public interface SendEmailService {

    /**
     * 发送邮件
     * @param sendMail 发送人邮箱
     * @param receiverMail 收件人邮箱
     * @param subject 主题
     * @param content 内容
     */
    void sentTextMail(String sendMail, String receiverMail, String subject, String content);

}
