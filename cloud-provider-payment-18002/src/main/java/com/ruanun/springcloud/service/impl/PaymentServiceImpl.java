package com.ruanun.springcloud.service.impl;

import com.ruanun.springcloud.dao.PaymentDao;
import com.ruanun.springcloud.entities.Payment;
import com.ruanun.springcloud.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author ruan
 */
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;
    @Value("${server.port}")
    private String serverPort;

    @Override
    public int save(Payment payment) {
        log.info("端口：{}", serverPort);
        return paymentDao.save(payment);
    }

    @Override
    public Payment getById(Long id) {
        log.info("端口：{}", serverPort);
        return paymentDao.getById(id);
    }
}
