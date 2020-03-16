package com.lp.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lp
 * @date 2020/3/16 15:51
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9003 {
    public static void main(String[] args) {
            SpringApplication.run(PaymentMain9003.class,args);
        }
}
