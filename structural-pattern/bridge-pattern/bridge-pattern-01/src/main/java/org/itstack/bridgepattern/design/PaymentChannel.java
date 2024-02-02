package org.itstack.bridgepattern.design;

/**
 * 支付通道枚举
 */
public enum PaymentChannel {
    WEIXIN(1,"模拟微信渠道支付划账开始。"),
    ALIPAY(2,"模拟支付宝渠道支付划账开始。");
    private final int code;
    private final String message;

    PaymentChannel(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
