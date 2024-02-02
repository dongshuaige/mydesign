package org.itstack.adapterpattern.design.user.more.impl;

import org.itstack.adapterpattern.design.user.more.IOuterUserHomeInfo;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    @Override
    public Map<String, Object> getUserHomeInfo() {
        Map<String, Object> officeInfo = new HashMap<>();
        officeInfo.put("homeTelNumber", "18281381");
        officeInfo.put("homeAddress", "Los Angeles");
        return officeInfo;
    }
}
