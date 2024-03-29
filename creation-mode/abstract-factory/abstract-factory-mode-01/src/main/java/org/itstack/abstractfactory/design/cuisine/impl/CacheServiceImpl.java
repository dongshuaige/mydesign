package org.itstack.abstractfactory.design.cuisine.impl;

import org.itstack.abstractfactory.design.CacheService;
import org.itstack.abstractfactory.design.RedisUtils;
import org.itstack.abstractfactory.design.matter.EGM;
import org.itstack.abstractfactory.design.matter.IIR;

import java.util.concurrent.TimeUnit;

public class CacheServiceImpl implements CacheService {
    private final IIR iir = new IIR();
    private final EGM egm = new EGM();

    private final RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key, int redisType) {
        if (1 == redisType) return egm.gain(key);
        if (2 == redisType) return iir.get(key);
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value, int redisType) {
        if (1 == redisType) {
            egm.set(key, value);
            return;
        }
        if (2 == redisType) {
            iir.set(key, value);
            return;
        }
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType) {
        if (1 == redisType) {
            egm.setEx(key, value, timeout, timeUnit);
            return;
        }
        if (2 == redisType) {
            iir.setExpire(key, value, timeout, timeUnit);
            return;
        }
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key, int redisType) {
        if (1 == redisType) {
            egm.delete(key);
            return;
        }
        if (2 == redisType) {
            iir.del(key);
            return;
        }
        redisUtils.del(key);
    }
}
