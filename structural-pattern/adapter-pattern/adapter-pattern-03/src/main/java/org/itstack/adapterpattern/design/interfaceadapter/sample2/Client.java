package org.itstack.adapterpattern.design.interfaceadapter.sample2;

import org.itstack.adapterpattern.design.interfaceadapter.sample2.adapter.Adapter;
import org.itstack.adapterpattern.design.interfaceadapter.sample2.adapter.impl.ConcreteAdapter;
import org.itstack.adapterpattern.design.interfaceadapter.sample2.impl.ConcreteTarget;

public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        Adapter adapter = new ConcreteAdapter(target);
        adapter.specificRequest();
    }
}
