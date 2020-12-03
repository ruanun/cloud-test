package com.ruanun.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ruan
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain20002 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain20002.class, args);
    }
}
