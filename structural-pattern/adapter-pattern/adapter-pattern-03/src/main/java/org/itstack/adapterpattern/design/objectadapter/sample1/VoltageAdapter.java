package org.itstack.adapterpattern.design.objectadapter.sample1;

import org.itstack.adapterpattern.design.classadapter.sample1.IVoltage5V;
import org.itstack.adapterpattern.design.classadapter.sample1.Voltage220V;

/**
 * 适配器类
 * 持有src类的实例（聚合src类），以解决兼容性的问题。
 * 即:持有 src类，实现 dst 类接口，完成src->dst的适配
 * 根据“合成复用原则”，在系统中尽量使用关联关系来替代继承关系
 */
public class VoltageAdapter implements IVoltage5V {
    /**
     * 关联关系-聚合
     */
    private Voltage220V voltage220V;

    /**
     * 通过构造器，传入一个 Voltage220V 实例
     *
     * @param voltage220V
     */

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            //获取220V 电压
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配~~");
            dst = src / 44;
            System.out.println("适配完成，输出的电压为=" + dst);
        }
        return dst;
    }
}
