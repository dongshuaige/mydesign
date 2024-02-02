package org.itstack.singleton.design.test;

import org.itstack.singleton.design.Singleton_00;
import org.itstack.singleton.design.Singleton_01;
import org.itstack.singleton.design.Singleton_07;
import org.junit.Test;

import java.util.Map;

public class ApiTest {
    @Test
    public void test_Singleton00(){
        Map<String, String> cache = Singleton_00.cache;
        System.out.println(cache);
    }
    
    @Test
    public void test_Singleton07(){
        Singleton_07.INSTANCE.test();
    }
}
