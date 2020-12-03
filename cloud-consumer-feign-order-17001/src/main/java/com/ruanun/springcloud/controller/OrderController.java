package com.ruanun.springcloud.controller;

import com.ruanun.springcloud.entities.CommonResult;
import com.ruanun.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ruan
 */
@RequestMapping("order")
@RestController
public class OrderController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @RequestMapping("get/{id}")
    public CommonResult get(@PathVariable Long id) {
        return paymentFeignService.getById(id);
    }
}
