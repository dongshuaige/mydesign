package org.itstack.ocp.design.impl;

import org.itstack.ocp.design.ICalculationArea;

/**
 * 面积计算实现
 */
public class CalculationArea implements ICalculationArea {
    private static final double π = 3.14D;


    @Override
    public double rectangle(double l, double w) {
        return l * w;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * ((p - x) * (p - y) * (p - z)));
    }

    @Override
    public double circular(double r) {
        return π * r * r;
    }
}
