package org.itstack.adapterpattern.design.user.more.impl;

import org.itstack.adapterpattern.design.user.more.IOuterUserOfficeInfo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    @Override
    public Map<String, Object> getUserOfficeInfo() {
        Map<String, Object> homeInfo = new HashMap<>();
        homeInfo.put("occupation", "Dungeon Master");
        homeInfo.put("officeTelNumber", "00988");
        return homeInfo;
    }
}
