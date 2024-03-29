package org.itstack.abstractfactory.design.factory.impl;

import org.itstack.abstractfactory.design.factory.ICacheAdapter;
import org.itstack.abstractfactory.design.matter.EGM;
import org.itstack.abstractfactory.design.matter.IIR;

import java.util.concurrent.TimeUnit;

public class IIRCacheAdapter implements ICacheAdapter {
    private final IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
