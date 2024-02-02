package org.itstact.lsp.design;

public class LSPTest2 {
    public static void main(String[] args) {
        Animal animal1 = new Birds();
        Animal animal2 = new BrownKiwis();
        animal1.setRunSpeed(120.0);
        animal2.setRunSpeed(180.0);
        System.out.println("如果奔跑300公里：");
        try {
            System.out.println("鸟类将奔跑" + animal1.getRunSpeed(300) + "小时.");
            System.out.println("几维鸟将奔跑" + animal2.getRunSpeed(300) + "小时。");
            Birds bird = new Swallows();
            bird.setFlySpeed(150);
            System.out.println("如果飞行300公里：");
            System.out.println("燕子将飞行" + bird.getFlyTime(300) + "小时.");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
}

class Animal {
    Double runSpeed;

    public Double getRunSpeed(double distance) {
        return distance / runSpeed;
    }

    public void setRunSpeed(Double runSpeed) {
        this.runSpeed = runSpeed;
    }
}

/**
 * 鸟类继承动物类
 */
class Birds extends Animal {
    double flySpeed;

    public double getFlyTime(double distance) {
        return distance / flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }
}

/**
 * 几维鸟继承动物类
 */
class BrownKiwis extends Animal {
    
}

/**
 * 燕子继承鸟类,飞行属于燕子的特性
 */
class Swallows extends Birds {
    
}
