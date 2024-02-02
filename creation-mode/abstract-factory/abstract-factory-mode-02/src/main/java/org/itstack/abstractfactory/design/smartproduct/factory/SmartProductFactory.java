package org.itstack.abstractfactory.design.smartproduct.factory;

import org.itstack.abstractfactory.design.smartproduct.car.ISmartCar;
import org.itstack.abstractfactory.design.smartproduct.phone.ISmartPhone;

/**
 * 1.创建产品抽象工厂 SmartProductFactory : ISmartCar createSmartCar/ISmartPhone createSmartPhone/....
 * 2.具体工厂 class xxFactory implements SmartProductFactory
 * 3.定义抽象产品接口 ISmartCar/ISmartPhone method void printInfo();
 * 4.具体产品 xxSmartPhone/xxSmartCar implements ISmartPhone/ISmartCar
 */
public interface SmartProductFactory {
    /**
     * 生产智能手机
     */
    ISmartPhone createSmartPhone();

    /**
     * 生产智能汽车
     */
    ISmartCar createSmartCar();
}
