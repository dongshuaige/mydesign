package org.itstack.adapterpattern.design;

import com.alibaba.fastjson.JSON;
import org.itstack.adapterpattern.design.mq.POPOrderDelivered;

public class POPOrderDeliveredService {
    public void onMessage(String message) {
        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);
        System.out.println(mq.getuId());
        System.out.println(mq.getOrderId());
        System.out.println(mq.getOrderTime());
        // TODO 处理自己的业务
    }
}
