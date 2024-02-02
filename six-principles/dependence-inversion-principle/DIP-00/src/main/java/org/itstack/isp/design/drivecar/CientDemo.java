package org.itstack.isp.design.drivecar;

public class CientDemo {
    /**
     * 乍一看没什么问题,小李只管开着他的奔驰车就好。但是假如有一天他不想开奔驰了，想换一辆宝马车玩玩怎么办呢？我们当然可以新建一个宝马车类，
     * 也给它弄一个run()方法，但问题是，这辆车有是有了，但是小李却不能开啊。因为司机类里面并没有宝马车的依赖。
     * 没有使用依赖倒置原则，模块与模块之间耦合度太高，生产力太低，只要需求一变就需要大面积重构，说明这样的设计是不合理
     * @param args
     */
    public static void main(String[] args) {
        Driver xiaoli = new Driver();
        Benz benz = new Benz();
        xiaoli.drive(benz);
    }
}
