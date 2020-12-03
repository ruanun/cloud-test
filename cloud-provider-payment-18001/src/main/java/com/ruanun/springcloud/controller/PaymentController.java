package com.ruanun.springcloud.controller;

import com.ruanun.springcloud.entities.CommonResult;
import com.ruanun.springcloud.entities.Payment;
import com.ruanun.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @author ruan
 */

@RestController
@RequestMapping("/payment/")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("save")
    public CommonResult<Payment> save(@RequestBody Payment payment) {

        int save = paymentService.save(payment);
        return CommonResult.success(payment, "插入成功！");
    }

    @RequestMapping("getById")
    public CommonResult<Payment> getById(@NotNull Long id) {
        return CommonResult.success(paymentService.getById(id));
    }

    @GetMapping("zipkin")
    public String zipkin() {
        return "zipkin test";
    }
}
