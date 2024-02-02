package org.itstack.isp.design;

/**
 * 投注用户
 */
public class BetUser {
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户权重
     */
    private int userWeight;

    public BetUser() {
    }

    public BetUser(String userName, int userWeight) {
        this.userName = userName;
        this.userWeight = userWeight;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }
}
