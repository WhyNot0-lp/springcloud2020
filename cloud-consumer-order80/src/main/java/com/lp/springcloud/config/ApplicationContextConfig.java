package com.lp.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lp
 * @date 2020/3/9 23:19
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced   //使用自己的负载均衡算法时注掉
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
