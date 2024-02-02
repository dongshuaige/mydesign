package org.itstack.adapterpattern.design;

import java.util.Date;

/**
 * 统一的MQ消息体
 * MQ消息中会有多种多样的类型属性，虽然他们都有同样的值提供给使用方，但是如果都这样接⼊
 * 那么当MQ消息特别多时候就会很麻烦。所以我们定义了通用的MQ消息体，后续把所有接⼊进来的消息进行统一的处理。
 */
public class RebateInfo {

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 业务Id
     */
    private String bizId;

    /**
     * 业务时间
     */
    private Date bizTime;

    /**
     * 业务描述
     */
    private String desc;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Date getBizTime() {
        return bizTime;
    }

    public void setBizTime(Date bizTime) {
        this.bizTime = bizTime;
    }

    public void setBizTime(String bizTime) {
        this.bizTime = new Date(Long.parseLong("1591024816000"));
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
