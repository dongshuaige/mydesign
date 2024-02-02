package org.itstack.abstractfactory.design.product.impl;

import org.itstack.abstractfactory.design.product.AbstractProductA;

/**
 * 产品族A1具体的实现类
 */
public class ProductA1 extends AbstractProductA {
    @Override
    public void doSomething() {
        System.out.println("产品A1的实现方法");
    }
}
