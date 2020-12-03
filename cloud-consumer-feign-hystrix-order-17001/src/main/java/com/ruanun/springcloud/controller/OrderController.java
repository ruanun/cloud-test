package com.ruanun.springcloud.controller;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.ruanun.springcloud.service.PaymentHystrixFeignService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ruan
 */
@RequestMapping("order")
@RestController
@DefaultProperties(defaultFallback = "paymentTimoutFallbackMethod") //仅加了HystrixCommand注解单未配置fallback的走默认的
public class OrderController {
    @Resource
    private PaymentHystrixFeignService paymentFeignService;

    @RequestMapping("/consumer/payment/hystrix/ok/{id}")
    public String info(@PathVariable Long id) {

        return paymentFeignService.info(id);
    }

    @RequestMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentTimoutFallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    public String info2(@PathVariable Long id) {

        return paymentFeignService.info2(id);
    }

    public String paymentTimoutFallbackMethod(Long id) {
        return "payment服务出错！";
    }




}
