package org.itstack.abstractfactory.design.product;

/**
 * 抽象产品类A
 */
public abstract class AbstractProductA {
    public void shareMethod(){
        System.out.println("每个产品共有的方法.......");
    }

    /**
     * 每个产品相同方法不同的实现
     */
    public abstract void doSomething();
}
