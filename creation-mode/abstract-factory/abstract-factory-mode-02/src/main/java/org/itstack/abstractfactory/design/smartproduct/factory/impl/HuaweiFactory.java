package org.itstack.abstractfactory.design.smartproduct.factory.impl;

import org.itstack.abstractfactory.design.smartproduct.car.ISmartCar;
import org.itstack.abstractfactory.design.smartproduct.car.impl.HuaweiSmartCar;
import org.itstack.abstractfactory.design.smartproduct.factory.SmartProductFactory;
import org.itstack.abstractfactory.design.smartproduct.phone.ISmartPhone;
import org.itstack.abstractfactory.design.smartproduct.phone.impl.HuaweiSmartPhone;

/**
 * 华为工厂
 */
public class HuaweiFactory implements SmartProductFactory {
    @Override
    public ISmartPhone createSmartPhone() {
        return new HuaweiSmartPhone();
    }

    @Override
    public ISmartCar createSmartCar() {
        return new HuaweiSmartCar();
    }
}
