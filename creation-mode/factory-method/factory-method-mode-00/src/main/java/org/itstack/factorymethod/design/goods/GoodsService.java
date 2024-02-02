package org.itstack.factorymethod.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * 模拟实物商品服务
 */
public class GoodsService {
    /**
     * 是否发放实物奖品
     * @param req
     * @return
     */
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
