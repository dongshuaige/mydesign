package org.itstack.adapterpattern.design.classadapter.sample1;


public class Client {
    public static void main(String[] args) {
        // 给手机充电
        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
