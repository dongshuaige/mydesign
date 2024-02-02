package org.itstack.adapterpattern.design.classadapter.sample1;

/**
 * 适配器类 将220V转化为5V
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        // 获取到220V电压
        int srcV = output220V();
        //转成5V(降压)
        return srcV / 44;
    }
}
