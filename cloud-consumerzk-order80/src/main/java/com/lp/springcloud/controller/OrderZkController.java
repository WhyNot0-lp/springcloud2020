package com.lp.springcloud.controller;

import com.lp.springcloud.entities.CommonResult;
import com.lp.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lp
 * @date 2020/3/9 23:16
 */
@RestController
@Slf4j
public class OrderZkController {

    public static final String PAYMENT_URL="http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/zk")
    public String getPayment(){
        return restTemplate.getForObject(PAYMENT_URL+"//payment/zk",String.class);
    }

}
