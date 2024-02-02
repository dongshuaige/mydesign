package org.itstack.factorymethod.test;

import com.alibaba.fastjson.JSON;
import org.itstack.factorymethod.design.AwardReq;
import org.itstack.factorymethod.design.AwardRes;
import org.itstack.factorymethod.design.PrizeController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class ApiTest {

    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_awardToUser() {
        PrizeController prizeController = new PrizeController();
        System.out.println("\r\n模拟发放优惠券测试\r\n");
        // 模拟发放优惠券测试
        AwardReq couponReq = new AwardReq();
        couponReq.setuId("10001");
        couponReq.setAwardType(1);
        couponReq.setAwardNumber("EGM1023938910232121323432");
        couponReq.setBizId("791098764902132");
        AwardRes couponAwardRes01 = prizeController.awardToUser(couponReq);
        logger.info("请求参数：{}", JSON.toJSON(couponReq));
        logger.info("测试结果：{}", JSON.toJSON(couponAwardRes01));
        System.out.println("---------------------------------------------------------");
        System.out.println("\r\n模拟发放实物商品\r\n");
        AwardReq goodsReq = new AwardReq();
        goodsReq.setuId("10001");
        goodsReq.setAwardType(2);
        goodsReq.setAwardNumber("9820198721311");
        goodsReq.setBizId("1023000020112221113");
        goodsReq.setExtMap(new HashMap<String,String>(){
            {
                put("consigneeUserName","蟹不肉");
                put("consigneeUserPhone","15200292123");
                put("consigneeUserAddress","上海市.浦东新区.高行镇.东靖路393弄.#44号1002");
            }
        });
        AwardRes goodsAwardRes01 = prizeController.awardToUser(goodsReq);
        logger.info("请求参数：{}", JSON.toJSON(goodsReq));
        logger.info("测试结果：{}", JSON.toJSON(goodsAwardRes01));
        System.out.println("---------------------------------------------------------");
        System.out.println("\r\n第三方兑换卡(爱奇艺)\r\n");
        AwardReq iQiYiCardReq = new AwardReq();
        iQiYiCardReq.setuId("10001");
        iQiYiCardReq.setAwardType(3);
        iQiYiCardReq.setAwardNumber("AQY1xjkUodl8LO975GdfrYUio");

        AwardRes iQiYiCardAwardRes = prizeController.awardToUser(iQiYiCardReq);
        logger.info("请求参数：{}", JSON.toJSON(iQiYiCardReq));
        logger.info("测试结果：{}", JSON.toJSON(iQiYiCardAwardRes));

    }
}
