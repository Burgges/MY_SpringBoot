package com.nick.service.impl;

import com.nick.service.SendEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

/**
 * 邮件发送接口实现
 * Created by Nick on 2018/8/19.
 */
@Service
public class SendEmailServiceImpl implements SendEmailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SendEmailServiceImpl.class);

    @Autowired
    private JavaMailSenderImpl javaMailSender;

    @Override
    public void sentTextMail(String sendMail, String receiverMail, String subject, String content) {

        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

            simpleMailMessage.setTo(receiverMail);
            simpleMailMessage.setFrom(sendMail);
            simpleMailMessage.setSubject(subject);
            simpleMailMessage.setText(content);

            javaMailSender.send(simpleMailMessage);

            LOGGER.info("邮件已发送");
        } catch (Exception e) {
            LOGGER.error("邮件发送失败");
            e.printStackTrace();
        }
    }
}
