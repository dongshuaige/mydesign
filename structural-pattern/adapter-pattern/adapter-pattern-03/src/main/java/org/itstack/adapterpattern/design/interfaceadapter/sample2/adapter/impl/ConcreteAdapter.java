package org.itstack.adapterpattern.design.interfaceadapter.sample2.adapter.impl;

import org.itstack.adapterpattern.design.interfaceadapter.sample2.Target;
import org.itstack.adapterpattern.design.interfaceadapter.sample2.adapter.Adapter;

/**
 * 实现适配器接口的具体类，同时持有目标接口的引用
 */
public class ConcreteAdapter implements Adapter {
    private Target target;

    public ConcreteAdapter(Target target) {
        this.target = target;
    }

    @Override
    public void specificRequest() {
        System.out.println("ConcreteAdapter.specificRequest() is called");
        target.request();
    }
}
