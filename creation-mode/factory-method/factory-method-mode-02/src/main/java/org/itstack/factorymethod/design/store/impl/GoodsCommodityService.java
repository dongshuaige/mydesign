package org.itstack.factorymethod.design.store.impl;

import com.alibaba.fastjson.JSON;
import org.itstack.factorymethod.design.goods.DeliverReq;
import org.itstack.factorymethod.design.goods.GoodsService;
import org.itstack.factorymethod.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 实物商品服务
 */
public class GoodsCommodityService implements ICommodity {
    private final Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    /**
     * 模拟注入商品服务
     */
    private final GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq req = new DeliverReq();
        req.setUserPhone(queryUserPhoneNumber(uId));
        req.setUserName(queryUserName(uId));
        req.setSku(commodityId);
        req.setOrderId(bizId);
        req.setConsigneeUserName(extMap.get("consigneeUserName"));
        req.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        req.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        Boolean isSuccess = goodsService.deliverGoods(req);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);
        if (!isSuccess) throw new RuntimeException("实物商品发送失败");
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
