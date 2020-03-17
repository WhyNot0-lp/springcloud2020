package com.lp.springcloud.alibaba.controller;

import com.lp.springcloud.alibaba.domain.CommonResult;
import com.lp.springcloud.alibaba.domain.Order;
import com.lp.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther lp
 * @create 2020-3-17 12:40
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
