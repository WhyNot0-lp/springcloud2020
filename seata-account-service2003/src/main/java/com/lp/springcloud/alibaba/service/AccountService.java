package com.lp.springcloud.alibaba.service;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author lp
 * @date 2020/3/17 20:18
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}
