package org.itstack.adapterpattern.design.user;

/**
 * 员工信息接口
 */
public interface IUserInfo {
    /**
     * 获取用户姓名
     */
    String getUserName();

    /**
     * 获取家庭地址
     */
    String getHomeAddress();

    /**
     * 手机号码
     */
    String getMobileNumber();

    /**
     * 办公电话（座机）
     */
    String getOfficeTelNumber();
    /**
     * 职位
     */
    String getOccupation();

    /**
     * 家庭电话
     */
    String getHomeTelNumber();
}
