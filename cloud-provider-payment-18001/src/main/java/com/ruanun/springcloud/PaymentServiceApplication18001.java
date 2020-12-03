package com.ruanun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ruan
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentServiceApplication18001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication18001.class, args);
    }
}
