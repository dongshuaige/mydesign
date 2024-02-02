package org.itstack.bridgepattern.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class PayController {
    private final Logger logger = LoggerFactory.getLogger(PayController.class);

    /**
     * 支付服务功能优化
     * @param uId      用户Id
     * @param tradeId  交易Id
     * @param amount   金额
     * @param channel  渠道
     * @param modeType 模式
     * @return
     */
    public boolean doPay(String uId, String tradeId, BigDecimal amount, PaymentChannel channel, int modeType) {
        logger.info(channel.getMessage().replace("{uId}", uId).replace("{tradeId}", tradeId).replace("{amount}", amount.toString()));
        modeCheck(modeType);
        return true;
    }

    /**
     * 支付服务功能
     *
     * @param uId         用户Id
     * @param tradeId     交易Id
     * @param amount      金额
     * @param channelType 渠道
     * @param modeType    模式
     * @return
     */
    public boolean doPay(String uId, String tradeId, BigDecimal amount, int channelType, int modeType) {
        // 微信支付
        if (1 == channelType) {
            logger.info("模拟微信渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
        } else if (2 == channelType) {
            // 支付宝支付
            logger.info("模拟支付宝渠道支付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
        }
        modeCheck(modeType);
        return true;
    }

    private void modeCheck(int modeType) {
        if (1 == modeType) {
            logger.info("密码支付,风险校验环境安全");
        } else if (2 == modeType) {
            logger.info("人脸支付,风险校验脸部安全");
        } else if (3 == modeType) {
            logger.info("指纹支付,风险校验指纹安全");
        }
    }
}
