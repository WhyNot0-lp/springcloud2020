package com.lp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lp
 * @date 2020/3/14 11:48
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
    public static void main(String[] args) {
            SpringApplication.run(ConfigClientMain3366.class,args);
        }
}
