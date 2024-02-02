package org.itstack.factorymethod.design.store.impl;

import com.alibaba.fastjson.JSON;
import org.itstack.factorymethod.design.card.IQiYiCardService;
import org.itstack.factorymethod.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 爱奇艺兑换卡服务实现
 */
public class CardCommodityService implements ICommodity {
    private final Logger logger = LoggerFactory.getLogger(CardCommodityService.class);
    /**
     * 模拟注入
     */
    private final IQiYiCardService iQiYiCardService = new IQiYiCardService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobileNumber = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobileNumber,commodityId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
