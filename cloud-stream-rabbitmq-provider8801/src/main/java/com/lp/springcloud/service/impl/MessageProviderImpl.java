package com.lp.springcloud.service.impl;

import com.lp.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import javax.annotation.Resource;
import org.springframework.cloud.stream.messaging.Source;

import java.util.UUID;

/**
 * @auther lp
 * @create 2020-3-14 17:35
 */
//定义消息的推送管道
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider
{

    // 消息发送管道
    @Resource
    private MessageChannel output;

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        //构建消息,往mq中发消息
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
        return null;
    }
}
