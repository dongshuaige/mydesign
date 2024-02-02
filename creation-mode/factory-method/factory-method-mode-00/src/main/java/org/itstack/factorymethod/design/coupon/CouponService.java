package org.itstack.factorymethod.design.coupon;

/**
 * 模拟优惠券服务
 */
public class CouponService {

    /**
     * 模拟发放优惠券
     * @param uId 优惠券Id
     * @param couponNumber 优惠券数量
     * @param uuid uuid
     * @return
     */
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张:" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
