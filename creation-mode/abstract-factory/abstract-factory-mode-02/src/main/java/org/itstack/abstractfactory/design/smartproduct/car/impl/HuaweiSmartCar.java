package org.itstack.abstractfactory.design.smartproduct.car.impl;

import org.itstack.abstractfactory.design.smartproduct.car.ISmartCar;

/**
 * 华为智能汽车
 */
public class HuaweiSmartCar implements ISmartCar {
    @Override
    public void printInfo() {
        System.out.println("华为智能汽车");
    }
}
