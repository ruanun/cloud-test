package com.ruanun.springcloud;

import com.ruanun.rule.Rules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author ruan
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = Rules.class)
public class OrderServiceApplication17001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication17001.class, args);
    }
}
