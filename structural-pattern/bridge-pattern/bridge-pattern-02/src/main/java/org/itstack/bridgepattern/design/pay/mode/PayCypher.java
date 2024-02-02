package org.itstack.bridgepattern.design.pay.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 密码环境信息校验
 */
public class PayCypher implements IPayMode {
    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);
    @Override
    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境信息");
        return true;
    }
}
