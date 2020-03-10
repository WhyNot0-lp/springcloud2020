package com.lp.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author lp
 * @date 2020/3/9 19:23
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/payment/zk")
    public String getPayment() {
        return "springcloud with zk" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
