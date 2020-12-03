package com.ruanun.springcloud.service.impl;

import com.ruanun.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author ruan
 */
@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String str = UUID.randomUUID().toString();
        Message<String> message = MessageBuilder.withPayload(str).build();
        boolean b = output.send(message);
        return String.valueOf(b);
    }
}
