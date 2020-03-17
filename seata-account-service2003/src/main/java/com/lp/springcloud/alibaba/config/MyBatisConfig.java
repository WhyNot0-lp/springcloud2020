package com.lp.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther lp
 * @create 2019-12-11 16:57
 */
@Configuration
@MapperScan({"com.lp.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
