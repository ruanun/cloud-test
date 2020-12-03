package com.ruanun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ruan
 */
@EnableEurekaClient
@SpringBootApplication
public class StreamRabbitMqApplication19001 {
    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitMqApplication19001.class, args);
    }
}
