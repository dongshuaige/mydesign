package org.itstack.adapterpattern.design.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 查询用户第三方下单收单接口
 */
public class POPOrderService {
    private final Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("POP商家,查询用户的订单是否为首单:{}", uId);
        return true;
    }

}
