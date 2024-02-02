package org.itstack.bridgepattern.design.pay.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 指纹信息校验
 */
public class PayFingerprintMode implements IPayMode {
    protected Logger logger = LoggerFactory.getLogger(PayFingerprintMode.class);
    @Override
    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return true;
    }
}
