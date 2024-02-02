package org.itstact.lsp.design;

/**
 * 存在的问题
 * 
 * 1、几维鸟类重写了鸟类的 setSpeed(double speed) 方法，这违背了里氏替换原则。
 *2、燕子和几维鸟都是鸟类，但是父类抽取的共性有问题，几维鸟的的飞行不是正常鸟类的功能，需要特殊处理，
 * 应该抽取更加共性的功能。
 */
public class LSPTest {
    public static void main(String[] args) {
        Bird bird1 = new Swallow();
        Bird bird2 = new BrownKiwi();
        bird1.setSpeed(120);
        bird2.setSpeed(120);
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子将飞行" + bird1.getFlyTime(300) + "小时.");
            System.out.println("几维鸟将飞行" + bird2.getFlyTime(300) + "小时。");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
}

/**
 * 鸟类
 */
class Bird {
    double flySpeed;

    public void setSpeed(double speed) {
        flySpeed = speed;
    }

    public double getFlyTime(double distance) {
        return (distance / flySpeed);
    }
}

//燕子类
class Swallow extends Bird {
}

//几维鸟类
class BrownKiwi extends Bird {
    public void setSpeed(double speed) {
        flySpeed = 0;
    }
}

