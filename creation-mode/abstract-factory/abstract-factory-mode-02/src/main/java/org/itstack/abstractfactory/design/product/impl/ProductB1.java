package org.itstack.abstractfactory.design.product.impl;

import org.itstack.abstractfactory.design.product.AbstractProductB;

/**
 * 产品族B1具体的实现类
 */
public class ProductB1 extends AbstractProductB {
    @Override
    public void doSomething() {
        System.out.println("产品B1的实现方法");
    }
}
