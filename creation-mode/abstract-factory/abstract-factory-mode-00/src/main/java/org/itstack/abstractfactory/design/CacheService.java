package org.itstack.abstractfactory.design;

import java.util.concurrent.TimeUnit;

/**
 * 单集群Redis使⽤方式
 */
public interface CacheService {

    /**
     * 根据key获取value
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设置不带过期时间的值
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 设置带有过期时间的值
     * @param key
     * @param value
     * @param timeout
     * @param timeUnit
     */
    void set(String key, String value, long timeout, TimeUnit timeUnit);

    /**
     * 删除key
     * @param key
     */
    void del(String key);
}
