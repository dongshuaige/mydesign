package org.itstack.adapterpattern.design.objectadapter.sample1;

import org.itstack.adapterpattern.design.classadapter.sample1.Phone;
import org.itstack.adapterpattern.design.classadapter.sample1.Voltage220V;

public class Client {
    public static void main(String[] args) {
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
