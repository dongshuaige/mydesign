package org.itstack.abstractfactory.design.test;

import org.itstack.abstractfactory.design.CacheService;
import org.itstack.abstractfactory.design.factory.JDKProxy;
import org.itstack.abstractfactory.design.factory.impl.EGMCacheAdapter;
import org.itstack.abstractfactory.design.factory.impl.IIRCacheAdapter;
import org.itstack.abstractfactory.design.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    /**
     * 使用代理的方式实现抽象工厂模式
     * 通过传入不同的集群类型，就可以调用不同的集群下的方法
     */
    @Test
    public void test_cacheService() {
        CacheService proxy_egm = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_egm.set("userName01", "小傅哥");
        String value01 = proxy_egm.get("userName01");
        System.out.println("测试结果:" + value01);

        CacheService proxy_iir = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_iir.set("userName01", "小傅哥");
        String value02 = proxy_iir.get("userName01");
        System.out.println("测试结果:" + value02);
    }
}
