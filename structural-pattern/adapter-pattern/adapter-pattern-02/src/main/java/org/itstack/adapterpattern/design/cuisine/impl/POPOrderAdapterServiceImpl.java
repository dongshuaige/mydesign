package org.itstack.adapterpattern.design.cuisine.impl;

import org.itstack.adapterpattern.design.OrderAdapterService;
import org.itstack.adapterpattern.design.service.POPOrderService;

/**
 * 第三方商品接口
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    private final POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
