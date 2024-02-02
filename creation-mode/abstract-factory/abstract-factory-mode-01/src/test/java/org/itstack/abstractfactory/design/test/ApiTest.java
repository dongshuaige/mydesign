package org.itstack.abstractfactory.design.test;

import org.itstack.abstractfactory.design.CacheService;
import org.itstack.abstractfactory.design.cuisine.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_cacheService() {
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("user_name_01", "小傅哥", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);
    }
}
