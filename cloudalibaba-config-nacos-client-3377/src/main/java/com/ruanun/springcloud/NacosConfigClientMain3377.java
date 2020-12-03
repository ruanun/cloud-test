package com.ruanun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ruan
 *Spring Cloud Alibaba Nacos配置中心
 * https://mrbird.cc/Spring-Cloud-Alibaba-Nacos%E9%85%8D%E7%BD%AE%E4%B8%AD%E5%BF%83.html
 *
 */

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
    }
}
