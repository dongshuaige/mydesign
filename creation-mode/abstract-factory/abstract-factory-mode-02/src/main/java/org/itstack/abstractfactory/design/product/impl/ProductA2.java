package org.itstack.abstractfactory.design.product.impl;

import org.itstack.abstractfactory.design.product.AbstractProductA;

/**
 * 产品A2具体的实现类
 */
public class ProductA2 extends AbstractProductA {
    @Override
    public void doSomething() {
        System.out.println("产品A2的实现方法");
    }
}
