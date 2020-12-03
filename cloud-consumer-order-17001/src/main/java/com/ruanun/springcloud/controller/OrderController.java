package com.ruanun.springcloud.controller;

import com.ruanun.springcloud.entities.CommonResult;
import com.ruanun.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author ruan
 */

@RestController
@RequestMapping("/order/")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("create")
    public CommonResult create(@RequestBody Payment payment) {
        return restTemplate.postForObject("http://CLOUD-PAYMENT-SERVICE/payment/save", payment, CommonResult.class);
    }

    @RequestMapping("get/{id}")
    public CommonResult get(@PathVariable Long id) {
        return restTemplate.getForObject("http://CLOUD-PAYMENT-SERVICE/payment/getById?id=" + id, CommonResult.class);
    }

    @GetMapping("consumer/zipkin")
    public String payzipkin() {
        return restTemplate.getForObject("http://CLOUD-PAYMENT-SERVICE/payment/zipkin", String.class);

    }
}
