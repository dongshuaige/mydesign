package org.itstack.abstractfactory.design.factory;

import org.itstack.abstractfactory.design.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类实现
 * 通过传进来的集群服务进行方法操作
 */
public class JDKInvocationHandler implements InvocationHandler {
    private final ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    /**
     * 通过获取方法名称反射方式,调用对应的方法功能,简化了整体的使用
     *
     * @param proxy  代理
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }
}
