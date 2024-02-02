package org.itstack.adapterpattern.design.user.impl;

import org.itstack.adapterpattern.design.user.IUserInfo;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名：Van");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("地址：Los Angeles");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("电话：009090");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("座机：9202083");
        return null;
    }

    @Override
    public String getOccupation() {
        System.out.println("职位：Dungeon Master");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家庭电话：Boy Next Door~");
        return null;
    }
}
