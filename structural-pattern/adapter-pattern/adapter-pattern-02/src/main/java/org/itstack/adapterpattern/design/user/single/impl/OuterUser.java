package org.itstack.adapterpattern.design.user.single.impl;

import org.itstack.adapterpattern.design.user.single.IOuterUser;

import java.util.HashMap;
import java.util.Map;

/**
 * 外包公司的人员实现
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map<String, Object> getUserBaseInfo() {
        Map<String,Object> baseInfo = new HashMap<>();
        baseInfo.put("userName","Van DarkHomle");
        baseInfo.put("mobileNumber","reoreoreoreo");
        return baseInfo;
    }

    @Override
    public Map<String, Object> getUserOfficeInfo() {
        Map<String,Object> homeInfo = new HashMap<>();
        homeInfo.put("occupation","Dungeon Master");
        homeInfo.put("officeTelNumber","00988");
        return homeInfo;
    }

    @Override
    public Map<String, Object> getUserHomeInfo() {
        Map<String,Object> officeInfo = new HashMap<>();
        officeInfo.put("homeTelNumber","18281381");
        officeInfo.put("homeAddress","Los Angeles");
        return officeInfo;
    }
}
