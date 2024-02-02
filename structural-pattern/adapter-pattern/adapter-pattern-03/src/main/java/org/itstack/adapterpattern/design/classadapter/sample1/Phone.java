package org.itstack.adapterpattern.design.classadapter.sample1;

public class Phone {
    /**
     * 手机充电方法
     *
     * @param iVoltage5V iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压过高, 不能充电~~");
        }
    }
}
