package com.ruanun.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author ruan
 */

@RestController
@RequestMapping("payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("consul")
    public String test() {
        return "register consul .serverPort: " + serverPort + "----" + UUID.randomUUID().toString();
    }
}
