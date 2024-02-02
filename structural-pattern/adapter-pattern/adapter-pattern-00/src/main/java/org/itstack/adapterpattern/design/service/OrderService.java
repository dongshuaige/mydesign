package org.itstack.adapterpattern.design.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 查询用户内部下单数量接口
 */
public class OrderService {
    private final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public long queryUserOrderCount(String userId) {
        logger.info("自营商家,查询用户的订单数量:{}", userId);
        return 10L;
    }
}
