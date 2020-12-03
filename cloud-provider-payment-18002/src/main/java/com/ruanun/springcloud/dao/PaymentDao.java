package com.ruanun.springcloud.dao;

import com.ruanun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ruan
 */
@Mapper
public interface PaymentDao {
    int save(Payment payment);

    Payment getById(@Param("id") Long id);
}
