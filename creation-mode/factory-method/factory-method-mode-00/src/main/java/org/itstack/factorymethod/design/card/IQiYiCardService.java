package org.itstack.factorymethod.design.card;

/**
 * 模拟爱奇艺会员卡服务
 */
public class IQiYiCardService {
    /**
     * 生成token
     *
     * @param bindMobileNumber 绑定的手机号码
     * @param cardId           会员卡Id
     */
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张:" + bindMobileNumber + "," + cardId);
    }
}
