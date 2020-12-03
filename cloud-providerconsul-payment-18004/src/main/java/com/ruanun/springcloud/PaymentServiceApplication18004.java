package com.ruanun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ruan
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServiceApplication18004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication18004.class,args);
    }
}
