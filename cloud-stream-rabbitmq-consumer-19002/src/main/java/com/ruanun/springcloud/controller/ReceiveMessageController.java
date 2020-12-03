package com.ruanun.springcloud.controller;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ruan
 */
@EnableBinding(Sink.class)
@RestController
public class ReceiveMessageController {

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("接收到的消息：" + message.getPayload());
    }
}
