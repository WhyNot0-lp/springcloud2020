package com.lp.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther lp
 * @create 2020-3-17 12:40:50
 */
@Configuration
@MapperScan({"com.lp.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
