package org.itstack.bridgepattern.design.pay.channel;

import org.itstack.bridgepattern.design.pay.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 支付类型桥接抽象类
 */
public abstract class Pay {

    protected Logger logger = LoggerFactory.getLogger(Pay.class);
    protected IPayMode payMode;
    
    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }
    

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
