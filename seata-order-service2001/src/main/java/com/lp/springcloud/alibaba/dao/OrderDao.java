package com.lp.springcloud.alibaba.dao;

import com.lp.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther lp
 * @create 2020-3-17 12:41
 */
@Mapper
public interface OrderDao {
    /**
     * 新建订单
     */
    void create(Order order);

    /**
     * 修改订单状态，从0改为1
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}