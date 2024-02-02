package org.itstack.adapterpattern.design.interfaceadapter.sample2.impl;

import org.itstack.adapterpattern.design.interfaceadapter.sample2.Target;

/**
 * 实现接口的具体类
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget.request() is called");
    }
}
