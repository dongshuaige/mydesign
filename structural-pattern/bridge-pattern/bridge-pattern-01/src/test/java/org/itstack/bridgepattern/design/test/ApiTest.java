package org.itstack.bridgepattern.design.test;

import org.itstack.bridgepattern.design.PayController;
import org.itstack.bridgepattern.design.PaymentChannel;
import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {
    @Test
    public void test_pay() {
        PayController pay = new PayController();
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        pay.doPay("weixin_1092033111", "100000109893", new BigDecimal(100), 1, 2);

        System.out.println("\r\n模拟测试场景；微信支付、密码方式。");
        pay.doPay("weixin_1092033112", "100000109894", new BigDecimal(100), 1, 1);


        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        pay.doPay("jlu19dlxo111","100000109895",new BigDecimal(100), 2, 3);

        System.out.println("\r\n模拟测试场景；支付宝支付、人脸方式。");
        pay.doPay("jlu19dlxo112","100000109896",new BigDecimal(100), 2, 2);
    }
    
    @Test
    public void test_payByEnum() {
        PayController pay = new PayController();
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        pay.doPay("weixin_1092033111", "100000109893", new BigDecimal(100), PaymentChannel.WEIXIN, 2);

        System.out.println("\r\n模拟测试场景；微信支付、密码方式。");
        pay.doPay("weixin_1092033112", "100000109894", new BigDecimal(100), PaymentChannel.WEIXIN, 1);


        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        pay.doPay("jlu19dlxo111","100000109895",new BigDecimal(100), PaymentChannel.ALIPAY, 3);

        System.out.println("\r\n模拟测试场景；支付宝支付、人脸方式。");
        pay.doPay("jlu19dlxo112","100000109896",new BigDecimal(100), PaymentChannel.ALIPAY, 2);
    }
}
