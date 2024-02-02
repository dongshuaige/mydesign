package org.itstack.bridgepattern.design.pay.mode;

/**
 * 支付模式接口
 */
public interface IPayMode {
    /**
     * 任何一个支付模式；刷脸、指纹、密码，都会过不同程度的安全风控，这里定义一个安全校验接口
     * @param uId
     */
    boolean security(String uId);
}
