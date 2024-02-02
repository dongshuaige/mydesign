package org.itstack.adapterpattern.design.cuisine.impl;

import org.itstack.adapterpattern.design.OrderAdapterService;
import org.itstack.adapterpattern.design.service.OrderService;

/**
 * 内部商品接口
 */
public class InsideOrderService implements OrderAdapterService {
    private final OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
