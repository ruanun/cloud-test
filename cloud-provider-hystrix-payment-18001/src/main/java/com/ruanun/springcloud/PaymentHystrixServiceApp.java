package com.ruanun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ruan
 */
@EnableCircuitBreaker
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixServiceApp.class, args);
    }
}
