package com.lp.springcloud.service;

import com.lp.springcloud.entities.Payment;

/**
 * @author lp
 * @date 2020/3/9 19:11
 */
public interface PaymentService {

    int create(Payment payment);


    Payment getPaymentById(Long id);

}
