package com.ruanun.springcloud.service;

import com.ruanun.springcloud.entities.Payment;

/**
 * @author ruan
 */

public interface PaymentService {
     int save(Payment payment);

     Payment getById( Long id);
}
