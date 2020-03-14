package com.lp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lp
 * @date 2020/3/13 10:19
 */
@EnableEurekaClient
@SpringBootApplication
public class GateWayMain9527 {
    public static void main(String[] args) {
            SpringApplication.run(GateWayMain9527.class,args);
        }
}
