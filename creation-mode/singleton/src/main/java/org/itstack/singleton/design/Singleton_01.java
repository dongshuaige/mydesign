package org.itstack.singleton.design;

/**
 * 懒汉模式(线程不安全)
 * 1. 懒汉式，线程不安全
 * 2、是否 Lazy 初始化： 是
 * 不支持多线程
 */
public class Singleton_01 {
    /**
     * 单例模式不允许有一个特点就是不允许外部直接创建,也就是 new Singleton_01(),因此这里在默认的构造函数上添加了私有属性private
     * 缺点: 目前此种方式的单例模式确实满足了懒加载,但是如果有多个访问者同时去获取对象实例,可以想象成一堆人在抢厕所,就会造成多个同样的实例并存,从而没有达到单例的要求。
     */
    private static Singleton_01 instance;

    private Singleton_01() {
    }

    /**
     * 在多个线程同时调用getInstance方法时，由于方法没有加锁，可能会出现以下情况
     * ① 这些线程可能会创建多个对象
     * ② 某个线程可能会得到一个未完全初始化的对象
     */
    public static Singleton_01 getInstance() {
        if (instance == null) {
            /**
             * 对于情况①来说:
             * 由于没有加锁，当线程A刚执行完if判断INSTANCE为null后还没来得及执行INSTANCE = new Singleton()
             * 此时线程B进来，if判断后INSTANCE为null，且执行完INSTANCE = new Singleton()
             * 然后，线程A接着执行，由于之前if判断INSTANCE为null，于是执行INSTANCE = new Singleton()重复创建了对象
             * 对于情况②来说:
             * 由于没有加锁，当线程A刚执行完if判断INSTANCE为null后开始执行 INSTANCE = new Singleton()
             * 但是注意，new Singleton()这个操作在JVM层面不是一个原子操作
             *（具体由三步组成：1.为INSTANCE分配内存空间；2.初始化INSTANCE；3.将INSTANCE指向分配的内存空间，
             * 且这三步在JVM层面有可能发生指令重排，导致实际执行顺序可能为1-3-2）
             * 因为new操作不是原子化操作，因此，可能会出现线程A执行new Singleton()时发生指令重排的情况，
             * 导致实际执行顺序变为1-3-2，当执行完1-3还没来及执行2时（虽然还没执行2，但是对象的引用已经有了，
             * 只不过引用的是一个还没初始化的对象），此时线程B进来进行if判断后INSTANCE不为null，
             * 然后直接把线程A new到一半的对象返回了
             */
            instance = new Singleton_01();
        }
        return instance;
    }
}
