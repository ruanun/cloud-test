package com.ruanun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ruan
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentServiceApplication18002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication18002.class, args);
    }
}
