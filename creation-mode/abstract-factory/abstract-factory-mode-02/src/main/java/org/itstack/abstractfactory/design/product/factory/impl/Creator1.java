package org.itstack.abstractfactory.design.product.factory.impl;

import org.itstack.abstractfactory.design.product.AbstractProductA;
import org.itstack.abstractfactory.design.product.AbstractProductB;
import org.itstack.abstractfactory.design.product.factory.AbstractCreator;
import org.itstack.abstractfactory.design.product.impl.ProductA1;
import org.itstack.abstractfactory.design.product.impl.ProductB1;

public class Creator1 extends AbstractCreator {
    /**
     * 只生产产品等级为1的A产品
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }


    /**
     * 只生产产品等级为1的A产品
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
