package org.itstack.abstractfactory.design.factory;

import java.util.concurrent.TimeUnit;

/**
 * 适配接⼝，分别包装两个集群中差异化的接⼝名称
 */
public interface ICacheAdapter {
    /**
     * 根据key获取value
     */
    String get(String key);

    /**
     * 设置不带过期时间的值
     */
    void set(String key, String value);

    /**
     * 设置带有过期时间的值
     */
    void set(String key, String value, long timeout, TimeUnit timeUnit);

    /**
     * 删除key
     */
    void del(String key);
}
