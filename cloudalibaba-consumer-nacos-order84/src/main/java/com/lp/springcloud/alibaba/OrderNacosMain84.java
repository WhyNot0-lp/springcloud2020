package com.lp.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lp
 * @date 2020/3/16 16:11
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class OrderNacosMain84 {
    public static void main(String[] args) {
            SpringApplication.run(OrderNacosMain84.class,args);
        }
}
