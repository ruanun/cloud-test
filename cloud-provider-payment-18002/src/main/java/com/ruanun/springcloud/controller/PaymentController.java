package com.ruanun.springcloud.controller;

import com.ruanun.springcloud.entities.CommonResult;
import com.ruanun.springcloud.entities.Payment;
import com.ruanun.springcloud.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author ruan
 */
@Log4j2
@RestController
@RequestMapping("/payment/")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("save")
    public CommonResult<Payment> save(@RequestBody Payment payment) {

        int save = paymentService.save(payment);
        return CommonResult.success(payment, "插入成功！");
    }

    @RequestMapping("getById")
    public CommonResult<Payment> getById(@NotNull Long id) {
        return CommonResult.success(paymentService.getById(id));
    }


    @GetMapping("discovery")
    public void discovery() {
        List<String> services = discoveryClient.getServices();
        for (String s : services) {
            log.info(s);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for (ServiceInstance instance : instances) {
            log.info(instance.getHost());
            log.info(instance.getInstanceId());
            log.info(instance.getMetadata());
            log.info(instance.getPort());
            log.info(instance.getScheme());
            log.info(instance.getServiceId());
            log.info(instance.getUri().toString());
        }
    }
}
