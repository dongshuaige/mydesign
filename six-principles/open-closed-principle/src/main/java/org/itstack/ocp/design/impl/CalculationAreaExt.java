package org.itstack.ocp.design.impl;

public class CalculationAreaExt extends CalculationArea {
    private static final double π = 3.1415926D;

    @Override
    public double circular(double r) {
        return π * r * r;
    }
}
