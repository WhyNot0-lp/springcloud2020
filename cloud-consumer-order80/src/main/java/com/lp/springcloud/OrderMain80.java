package com.lp.springcloud;

import com.lp.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author lp
 * @date 2020/3/9 23:13
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)  //使用自定义的负载均衡算法
public class OrderMain80 {

    public static void main(String[] args) {
            SpringApplication.run(OrderMain80.class,args);
        }

}
