package org.itstack.isp.design.drivercar.impl;

import org.itstack.isp.design.drivercar.ICar;

public class Bwm implements ICar {
    @Override
    public void run() {
        System.out.println("宝马启动中...");
    }
}
