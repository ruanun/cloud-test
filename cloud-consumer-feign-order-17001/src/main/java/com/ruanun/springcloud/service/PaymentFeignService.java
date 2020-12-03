package com.ruanun.springcloud.service;

import com.ruanun.springcloud.entities.CommonResult;
import com.ruanun.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ruan
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("/payment/getById")
    CommonResult<Payment> getById(@RequestParam("id") Long id);
}
