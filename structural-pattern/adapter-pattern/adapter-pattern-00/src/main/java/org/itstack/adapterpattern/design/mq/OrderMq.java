package org.itstack.adapterpattern.design.mq;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * 内部订单MQ
 */
public class OrderMq {
    /**
     * 用户ID
     */
    private String uid;

    /**
     * 商品
     */
    private String sku;

    /**
     * 订单ID
     */
    private String OrderId;

    /**
     * 下单时间
     */
    private Date createOrderTime;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public Date getCreateOrderTime() {
        return createOrderTime;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
