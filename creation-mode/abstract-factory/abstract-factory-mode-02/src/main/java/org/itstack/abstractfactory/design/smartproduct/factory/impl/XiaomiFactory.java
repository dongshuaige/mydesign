package org.itstack.abstractfactory.design.smartproduct.factory.impl;

import org.itstack.abstractfactory.design.smartproduct.car.ISmartCar;
import org.itstack.abstractfactory.design.smartproduct.car.impl.XiaomiSmartCar;
import org.itstack.abstractfactory.design.smartproduct.factory.SmartProductFactory;
import org.itstack.abstractfactory.design.smartproduct.phone.ISmartPhone;
import org.itstack.abstractfactory.design.smartproduct.phone.impl.XiaomiSmartPhone;

/**
 * 小米工厂
 */
public class XiaomiFactory implements SmartProductFactory {
    @Override
    public ISmartPhone createSmartPhone() {
        return new XiaomiSmartPhone();
    }

    @Override
    public ISmartCar createSmartCar() {
        return new XiaomiSmartCar();
    }
}
