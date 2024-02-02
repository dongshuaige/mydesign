package org.itstack.adapterpattern.design;

import com.alibaba.fastjson.JSON;
import org.itstack.adapterpattern.design.mq.OrderMq;

public class OrderMqService {
    public void onMessage(String message) {
        OrderMq mq = JSON.parseObject(message, OrderMq.class);
        System.out.println(mq.getUid());
        System.out.println(mq.getOrderId());
        System.out.println(mq.getCreateOrderTime());
        // TODO 处理自己的业务
    }
}
