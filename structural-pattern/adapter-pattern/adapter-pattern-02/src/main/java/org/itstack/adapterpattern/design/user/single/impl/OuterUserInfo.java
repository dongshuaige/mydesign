package org.itstack.adapterpattern.design.user.single.impl;

import org.itstack.adapterpattern.design.user.IUserInfo;

import java.util.Map;

/**
 * 接入中转角色
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private final Map<String, Object> baseInfo = super.getUserBaseInfo();
    private final Map<String, Object> homeInfo = super.getUserHomeInfo();
    private final Map<String, Object> officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getOccupation() {
        String occupation = (String) this.officeInfo.get("occupation");
        System.out.println(occupation);
        return occupation;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
