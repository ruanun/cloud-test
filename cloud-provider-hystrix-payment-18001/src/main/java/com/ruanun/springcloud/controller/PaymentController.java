package com.ruanun.springcloud.controller;

import com.ruanun.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ruan
 */

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/payment/hystrix/ok/{id}")
    public String info(@PathVariable Long id) {

        return paymentService.info(id);
    }

    @RequestMapping("/payment/hystrix/timeout/{id}")
    public String info2(@PathVariable Long id) {

        return paymentService.info2(id);
    }


    //====服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id)
    {
        String result = paymentService.paymentCircuitBreaker(id);
        return result;
    }
}
