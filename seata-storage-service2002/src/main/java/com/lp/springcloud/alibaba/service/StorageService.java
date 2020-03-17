package com.lp.springcloud.alibaba.service;


/**
 * @author lp
 * @date 2020/3/17 20:03
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
