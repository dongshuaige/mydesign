package org.itstack.lsp.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class BankCard {
    private final Logger logger = LoggerFactory.getLogger(BankCard.class);

    /**
     * 银行卡号
     */
    private String cardNo;

    /**
     * 开卡日期
     */
    private String cardDate;

    public BankCard(String cardNo, String cardDate) {
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    abstract boolean rule(BigDecimal amount);

    // 正向入账，+ 钱
    public String positive(String orderId, BigDecimal amount) {
        // 入款成功，存款、还款
        logger.info("卡号{} 入款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    // 逆向入账，- 钱
    public String negative(String orderId, BigDecimal amount) {
        // 出款成功，存款、还款
        logger.info("卡号{} 出款成功，单号：{} 金额：{}", cardNo, orderId, amount);
        return "0000";
    }

    /**
     * 交易流水查询
     *
     * @return 交易流水
     */
    public List<String> tradeFlow() {
        logger.info("交易流水查询成功");
        List<String> tradeList = new ArrayList<String>();
        tradeList.add("100001,100.00");
        tradeList.add("100001,80.00");
        tradeList.add("100001,76.50");
        tradeList.add("100001,126.00");
        return tradeList;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }
}
