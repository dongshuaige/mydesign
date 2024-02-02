package org.itstack.abstractfactory.design.product.factory;

import org.itstack.abstractfactory.design.product.AbstractProductA;
import org.itstack.abstractfactory.design.product.AbstractProductB;

/**
 * 抽象工厂类
 * 注意:有M个产品等级就应该有M个实现工厂类，在每个实现工厂中，实现不同产品族的生产任务
 */
public abstract class AbstractCreator {
    /**
     * 创建A产品家族
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建B产品家族
     */
    public abstract AbstractProductB createProductB();
}
