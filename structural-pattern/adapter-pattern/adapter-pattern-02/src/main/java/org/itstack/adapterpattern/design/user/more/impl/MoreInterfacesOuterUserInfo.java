package org.itstack.adapterpattern.design.user.more.impl;

import org.itstack.adapterpattern.design.user.IUserInfo;
import org.itstack.adapterpattern.design.user.more.IOuterUserBaseInfo;
import org.itstack.adapterpattern.design.user.more.IOuterUserHomeInfo;
import org.itstack.adapterpattern.design.user.more.IOuterUserOfficeInfo;

import java.util.Map;

/**
 * 多接口适配下的中转角色
 */
public class MoreInterfacesOuterUserInfo implements IUserInfo {
    // 源目标对象
    private IOuterUserBaseInfo baseInfo;
    private IOuterUserHomeInfo homeInfo;
    private IOuterUserOfficeInfo officeInfo;
    
    //数据处理
    private Map<String,Object> baseMap;
    private Map<String,Object> homeMap;
    private Map<String,Object> officeMap;

    // 通过setter方法给源对象和相应的Map对象赋值
    public void setBaseInfo(IOuterUserBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        this.baseMap = this.baseInfo.getUserBaseInfo();
    }

    public void setHomeInfo(IOuterUserHomeInfo homeInfo) {
        this.homeInfo = homeInfo;
        this.homeMap = this.homeInfo.getUserHomeInfo();
    }

    public void setOfficeInfo(IOuterUserOfficeInfo officeInfo) {
        this.officeInfo = officeInfo;
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        String userName = (String) this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }
    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }
    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }
    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }
    @Override
    public String getOccupation() {
        String occupation = (String) this.officeMap.get("occupation");
        System.out.println(occupation);
        return occupation;
    }
    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
