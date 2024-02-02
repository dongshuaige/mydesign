package org.itstack.singleton.design;

/**
 * 饿汉模式(线程安全)
 * 优点：没有加锁，执行效率会提高
 * 缺点：类加载时就初始化，浪费内存。它基于 classloder 机制避免了多线程的同步问题，不过，
 * instance 在类装载时就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法，
 * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果.
 */
public class Singleton_03 {
    private static final Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    /**
     * 此种方式与我们开头的第一个实例化 Map 基本一致，在程序启动的时候直接运行加载，后续有外部需要使用的时候获取即可。
     * 但此种方式并不是懒加载，也就是说无论你程序中是否用到这样的类都会在程序启动之初进行创建。
     * 那么这种方式导致的问题就像你下载个游戏软件，可能你游戏地图还没有打开呢，但是程序已经将
     * 这些地图全部实例例化。到你手机上最明显体验就一开游戏内存满了，手机卡了,需要换了。
     *
     * @return
     */
    public static Singleton_03 getInstance() {
        return instance;
    }
}
