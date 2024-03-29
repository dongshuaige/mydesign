package org.itstack.singleton.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态类使用
 */
public class Singleton_00 {
    /**
     * 这样静态类的方式可以在第一次运行的时候直接初始化Map类，同时这里我们也不需要延迟加载在使用。
     * 在不需要维持任何状态下，仅用于全局访问，这个使用静态类的方式更加方便。
     * 但如果需要被继承以及需要维持一些特定状态的情况下，就适合使用单例模式。
     */
    public static Map<String,String> cache = new ConcurrentHashMap<>();
    static {
        cache.put("IdNo","100001");
        cache.put("name","小傅哥");
        cache.put("profession","京东T8架构师");
    }
}
