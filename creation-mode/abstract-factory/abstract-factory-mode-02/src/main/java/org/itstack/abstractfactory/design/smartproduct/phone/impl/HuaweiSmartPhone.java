package org.itstack.abstractfactory.design.smartproduct.phone.impl;

import org.itstack.abstractfactory.design.smartproduct.phone.ISmartPhone;

/**
 * 华为智能手机
 */
public class HuaweiSmartPhone implements ISmartPhone {
    @Override
    public void printInfo() {
        System.out.println("华为智能手机");
    }
}
