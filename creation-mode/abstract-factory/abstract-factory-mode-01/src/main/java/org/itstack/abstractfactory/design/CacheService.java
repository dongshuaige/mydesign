package org.itstack.abstractfactory.design;

import java.util.concurrent.TimeUnit;

public interface CacheService {
    /**
     * 根据key获取value
     */
    String get(String key, int redisType);

    /**
     * 设置不带过期时间的值
     */
    void set(String key, String value, int redisType);

    /**
     * 设置带有过期时间的值
     */
    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    /**
     * 删除key
     */
    void del(String key, int redisType);
}
