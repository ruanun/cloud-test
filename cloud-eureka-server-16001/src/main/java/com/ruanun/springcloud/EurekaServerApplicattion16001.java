package com.ruanun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ruan
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplicattion16001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplicattion16001.class, args);
    }
}
