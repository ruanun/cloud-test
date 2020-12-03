package com.ruanun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ruan
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServiceApplication18003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication18003.class, args);
    }
}
