package com.ruanun.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ruan
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PyamentMain20001 {
    public static void main(String[] args) {
        SpringApplication.run(PyamentMain20001.class, args);
    }
}
