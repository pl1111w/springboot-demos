package com.pl1111w.sendemail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SendEmailApplicationTests {
    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    public void contextLoads() {
        SimpleMailMessage simpleMessage = new SimpleMailMessage();
        simpleMessage.setSubject("开会");
        simpleMessage.setText("今天开黑");
        simpleMessage.setTo("2938008579@qq.com");
        simpleMessage.setFrom("1362596047@qq.com");
        javaMailSender.send(simpleMessage);
        System.out.println("发送成功！");
    }

    @Test
    public void sendMail() throws MessagingException {
        //复杂邮件消息
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
        messageHelper.setTo("2938008579@qq.com");
        messageHelper.setFrom("1362596047@qq.com");
        messageHelper.setSubject("发送图片");
        messageHelper.setText("<b style='color:red'>参与抽奖</b>", true);
        messageHelper.addAttachment("git.png", new File("F:\\git.png"));
        messageHelper.addAttachment("git1.png", new File("F:\\git.png"));
        javaMailSender.send(mimeMessage);
        System.out.println("发送成功！");

    }

}

