package com.ruanun.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author ruan
 */

@Component
public class PaymentHystrixFeignFallBackService implements PaymentHystrixFeignService{
    @Override
    public String info(Long id) {
        return "-----------fallback";
    }

    @Override
    public String info2(Long id) {
        return "-----------fallback";
    }
}
