package org.itstack.singleton.design;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS(AtomicReference) 线程安全<br>
 * <p>
 * java并发库提供了很多原子类来支持并发访问的数据安全性；
 * AtomicInteger 、 AtomicBoolean 、 AtomicLong 、 AtomicReference 。<br>
 * AtomicReference 可以封装引用一个V实例，支持并发访问。<br>
 * 使用CAS的好处就是不需要使用传统的加锁方式保证线程安全，而是依赖于CAS的忙等算法，依赖
 * 于底层硬件的实现，来保证线程安全。相对于其他锁的实现没有线程的切换和阻塞也就没有了额外
 * 的开销，并且可以支持较大的并发性。
 * 当然CAS也有一个缺点就是忙等，如果一直没有获取到将会处于死循环中。
 */
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<>();
    private static Singleton_06 instance;

    private Singleton_06() {
    }

    public static Singleton_06 getInstance() {
        for (; ; ) {
            Singleton_06 instance = INSTANCE.get();
            if (instance != null) return instance;
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        // org.itstack.singleton.design.Singleton_06@2503dbd3
        // 第一次访问需要实例化对象
        System.out.println(Singleton_06.getInstance());
        // org.itstack.singleton.design.Singleton_06@2503dbd3
        // 第二次访问直接返回对象实例
        System.out.println(Singleton_06.getInstance());
    }

}
