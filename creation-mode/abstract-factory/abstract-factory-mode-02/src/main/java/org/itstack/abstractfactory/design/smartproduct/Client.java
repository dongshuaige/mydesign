package org.itstack.abstractfactory.design.smartproduct;

import org.itstack.abstractfactory.design.smartproduct.car.ISmartCar;
import org.itstack.abstractfactory.design.smartproduct.car.impl.HuaweiSmartCar;
import org.itstack.abstractfactory.design.smartproduct.factory.SmartProductFactory;
import org.itstack.abstractfactory.design.smartproduct.factory.impl.HuaweiFactory;
import org.itstack.abstractfactory.design.smartproduct.factory.impl.XiaomiFactory;
import org.itstack.abstractfactory.design.smartproduct.phone.ISmartPhone;

/**
 * 客户端调用
 */
public class Client {
    public static void main(String[] args) {
        //======================定义抽象工厂============================
        SmartProductFactory huaweiFactory = new HuaweiFactory();
        SmartProductFactory xiaomiFactory = new XiaomiFactory();
        // 具体产品
        ISmartCar huaweiSmartCar = huaweiFactory.createSmartCar();
        huaweiSmartCar.printInfo();
        ISmartPhone huaweiSmartPhone = huaweiFactory.createSmartPhone();
        huaweiSmartPhone.printInfo();

        ISmartCar xiaomiSmartCar = xiaomiFactory.createSmartCar();
        xiaomiSmartCar.printInfo();
        
        ISmartPhone xiaomiSmartPhone = xiaomiFactory.createSmartPhone();
        xiaomiSmartPhone.printInfo();
    }
}
