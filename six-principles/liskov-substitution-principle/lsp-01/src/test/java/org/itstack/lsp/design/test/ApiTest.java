package org.itstack.lsp.design.test;

import com.alibaba.fastjson.JSON;
import org.itstack.lsp.design.CashCard;
import org.itstack.lsp.design.CreditCard;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

public class ApiTest {
    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_cashCard() {
        CashCard cashCard = new CashCard();
        // 提现
        cashCard.withdrawal("100001", new BigDecimal(100));
        // 储蓄
        cashCard.recharge("100001", new BigDecimal(100));
        // 交易流水
        List<String> tradeFlow = cashCard.tradeFlow();
        logger.info("查询交易流水，{}", JSON.toJSONString(tradeFlow));
    }
    
    @Test
    public void test_creditCard(){
        CreditCard creditCard = new CreditCard();
        // 贷款
        String result = creditCard.withdrawal("100001", new BigDecimal(1000));
        // 还款
        if ("0000".equals(result)) {
            creditCard.recharge("100001", new BigDecimal(1000));
        }
        // 交易流水
        List<String> tradeFlow = creditCard.tradeFlow();
        logger.info("查询交易流水，{}", JSON.toJSONString(tradeFlow));
    }
}
