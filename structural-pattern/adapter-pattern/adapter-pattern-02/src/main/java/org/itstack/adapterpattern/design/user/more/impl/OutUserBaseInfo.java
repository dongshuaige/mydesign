package org.itstack.adapterpattern.design.user.more.impl;

import org.itstack.adapterpattern.design.user.more.IOuterUserBaseInfo;

import java.util.HashMap;
import java.util.Map;

public class OutUserBaseInfo implements IOuterUserBaseInfo {
    @Override
    public Map<String, Object> getUserBaseInfo() {
        Map<String,Object> baseInfo = new HashMap<>();
        baseInfo.put("userName","Van DarkHomle");
        baseInfo.put("mobileNumber","reoreoreoreo");
        return baseInfo;
    }
}
