package org.itstack.adapterpattern.design.mq;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 第三方订单MQ
 */
public class POPOrderDelivered {
    /**
     * 用户ID
     */
    private String uId;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 商品
     */
    private Date sku;

    /**
     * 商品名称
     */
    private Date skuName;

    /**
     * 金额
     */
    private BigDecimal amount;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getSku() {
        return sku;
    }

    public void setSku(Date sku) {
        this.sku = sku;
    }

    public Date getSkuName() {
        return skuName;
    }

    public void setSkuName(Date skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
