package org.itstack.abstractfactory.design.product;

import org.itstack.abstractfactory.design.product.factory.AbstractCreator;
import org.itstack.abstractfactory.design.product.factory.impl.Creator1;
import org.itstack.abstractfactory.design.product.factory.impl.Creator2;

public class Client {
    public static void main(String[] args) {
        // 定义两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        // 产生A1对象
        AbstractProductA a1 = creator1.createProductA();
        // 产生A2对象
        AbstractProductA a2 = creator2.createProductA();

        // 产生B1对象
        AbstractProductB b1 = creator1.createProductB();
        // 产生B2对象
        AbstractProductB b2 = creator2.createProductB();

        /*
         * 继续业务处理
         **/
        a1.doSomething();
        a2.doSomething();
        b1.doSomething();
        b2.doSomething();

    }
}
