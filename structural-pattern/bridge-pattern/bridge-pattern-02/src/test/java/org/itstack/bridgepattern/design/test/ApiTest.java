package org.itstack.bridgepattern.design.test;

import org.itstack.bridgepattern.design.pay.channel.Pay;
import org.itstack.bridgepattern.design.pay.channel.WxPay;
import org.itstack.bridgepattern.design.pay.channel.ZfbPay;
import org.itstack.bridgepattern.design.pay.mode.PayCypher;
import org.itstack.bridgepattern.design.pay.mode.PayFaceMode;
import org.itstack.bridgepattern.design.pay.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {
    @Test
    public void test_pay() {
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("zfb_1092033112", "100000109894", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、密码方式。");
        Pay zfbPayCypher = new ZfbPay(new PayCypher());
        zfbPayCypher.transfer("zfb_1092033113", "100000109895", new BigDecimal(200));
    }
}
