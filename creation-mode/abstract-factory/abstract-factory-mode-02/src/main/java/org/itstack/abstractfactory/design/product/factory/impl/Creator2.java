package org.itstack.abstractfactory.design.product.factory.impl;

import org.itstack.abstractfactory.design.product.AbstractProductA;
import org.itstack.abstractfactory.design.product.AbstractProductB;
import org.itstack.abstractfactory.design.product.factory.AbstractCreator;
import org.itstack.abstractfactory.design.product.impl.ProductA2;
import org.itstack.abstractfactory.design.product.impl.ProductB2;

public class Creator2 extends AbstractCreator {
    /**
     * 只生产产品等级为2的A产品
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }


    /**
     * 只生产产品等级为2的A产品
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
