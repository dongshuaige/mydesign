package org.itstack.abstractfactory.design.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 抽象工厂代理类
 */
public class JDKProxy {
    /**
     * 完成代理理类，同时对于使用哪个集群有外部通过⼊参进⾏传递
     *
     * @param interfaceClass 类
     * @param cacheAdapter   缓存适配器
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }
}
