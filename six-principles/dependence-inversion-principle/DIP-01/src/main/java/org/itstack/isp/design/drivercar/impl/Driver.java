package org.itstack.isp.design.drivercar.impl;

import org.itstack.isp.design.drivercar.ICar;
import org.itstack.isp.design.drivercar.IDriver;

/**
 * 司机实现类
 */
public class Driver implements IDriver {
    @Override
    public void driver(ICar car) {
        car.run();
    }
}
