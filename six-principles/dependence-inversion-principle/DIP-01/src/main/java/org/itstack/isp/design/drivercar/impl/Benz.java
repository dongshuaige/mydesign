package org.itstack.isp.design.drivercar.impl;

import org.itstack.isp.design.drivercar.ICar;

public class Benz implements ICar {
    @Override
    public void run() {
        System.out.println("奔驰启动中...");
    }
}
