package com.lp.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lp
 * @date 2020/3/13 17:22
 */
//修改完成后需要客户端发送一个post请求
    //curl -X POST "http://localhost:3355/actuator/refresh"
@RefreshScope
@RestController
public class ConfigClientController {


    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo()
    {
        return configInfo;
    }

}
