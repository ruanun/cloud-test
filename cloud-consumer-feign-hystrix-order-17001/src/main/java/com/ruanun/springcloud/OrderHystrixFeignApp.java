package com.ruanun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ruan
 */
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class OrderHystrixFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixFeignApp.class, args);
    }
}
