package org.itstack.abstractfactory.design.smartproduct.phone.impl;

import org.itstack.abstractfactory.design.smartproduct.phone.ISmartPhone;
/**
 * 小米智能手机
 */
public class XiaomiSmartPhone implements ISmartPhone {
    @Override
    public void printInfo() {
        System.out.println("小米智能手机");
    }
}
