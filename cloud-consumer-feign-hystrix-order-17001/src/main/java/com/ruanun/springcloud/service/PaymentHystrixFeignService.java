package com.ruanun.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ruan
 */
@Service
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT", fallback = PaymentHystrixFeignFallBackService.class)
public interface PaymentHystrixFeignService {
    @RequestMapping("/payment/hystrix/ok/{id}")
    String info(@PathVariable("id") Long id);

    @RequestMapping("/payment/hystrix/timeout/{id}")
    String info2(@PathVariable("id") Long id);
}
