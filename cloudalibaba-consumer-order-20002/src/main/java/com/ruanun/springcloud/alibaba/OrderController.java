package com.ruanun.springcloud.alibaba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ruan
 */

@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/nacos/test/{id}")
    public String test(@PathVariable("id") Integer id) {
        return restTemplate.getForObject("http://nacos-payment-provider/payment/nacos/test/" + id, String.class);
    }

}
