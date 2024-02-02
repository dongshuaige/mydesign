package org.itstack.abstractfactory.design.smartproduct.car.impl;

import org.itstack.abstractfactory.design.smartproduct.car.ISmartCar;

/**
 * 小米智能汽车
 */
public class XiaomiSmartCar implements ISmartCar {
    @Override
    public void printInfo() {
        System.out.println("小米智能汽车");
    }
}
