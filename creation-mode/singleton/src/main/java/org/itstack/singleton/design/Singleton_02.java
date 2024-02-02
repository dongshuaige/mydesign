package org.itstack.singleton.design;

/**
 * 懒汉式(线程安全的)\
 * 懒加载: 是
 * 多线程
 */
public class Singleton_02 {
    private static Singleton_02 instance;

    private Singleton_02() {
    }

    /**
     * 必须加锁 synchronized 才能保证单例，但加锁会影响效率,所有的访问都因需要锁占用导致资源的浪费。
     * getInstance()的性能对应用程序不是很关键（该方法使用不太频繁）
     * 注意: 这里是粗暴地对整个 getInstance() 方法加锁，这样做代价很大，因为，只有当第一次调用 getInstance() 时才需要同步创建对象，
     * 创建之后再次调用 getInstance() 时就只是简单的返回成员变量，而这里是无需同步的，所以没必要对整个方法加锁。
     *
     * @return
     */
    public static synchronized Singleton_02 getInstance() {
        if (instance == null) {
            instance = new Singleton_02();
        }
        return instance;
    }

    /**
     * 由于同步一个方法会降低上百倍甚至更高的性能，每次调用获取和释放锁的开销似乎是可以避免的：一旦初始化完成，获取和释放锁就显得很不必要。
     * 所以可以只对方法的部分代码加锁！
     * 每个线程进到这个方法中之后先加锁，这样就保证了 if (INSTANCE == null) 和 INSTANCE = new Lock2Singleton()
     * 这两行代码被同一个线程执行时不会有另外一个线程进来，由此保证了创建的对象是唯一的。
     * 但是不能防止指令重排,因此可以使用双重锁校验(double-check),具体可查看Singleton_05;
     *
     * @return
     */

    public static Singleton_02 getInstance1() {
        // 因为INSTANCE是静态变量，所以给Lock2Singleton的Claa对象上锁
        // 虽然加了 synchronized，但是 synchronized 是不能禁止指令重排的，也就是说，
        //INSTANCE = new Lock2Singleton(); 这行代码在 JVM 层面还是有可能发生 1-3-2 的现象 TODO: 加 volatile 关键字,禁止指令重排
        synchronized (Singleton_02.class) {
            if (instance == null) {
                instance = new Singleton_02();
            }
        }
        return instance;
    }
}
