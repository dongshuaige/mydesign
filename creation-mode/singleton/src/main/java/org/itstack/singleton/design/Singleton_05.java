package org.itstack.singleton.design;

/**
 * 双重锁校验(DCL[Double-check-lock])
 */
public class Singleton_05 {
    /**
     * Volatile禁止JVM对指令进行重排序。所以创建对象的过程仍然会按照指令1-2-3 的有序执行。<br>
     * 保证变量的可见性：当一个被volatile关键字修饰的变量被一个线程修改的 时候，其他线程可以立刻得到修改之后的结果。<br>
     * 屏蔽指令重排序：指令重排序是编译器和处理器为了高效对程序进行优化的手段，它只能保证程序执行的结果时正确的，但是无法保证程序的操作顺序与代码顺序一致。
     * 这在单线程中不会构成问题，但是在多线程中就会出现。
     */
    private static volatile Singleton_05 INSTANCE;

    private Singleton_05() {
    }

    /**
     * 双重锁的方式是方法级锁的优化，减少了部分获取实例的耗时。同时这种方式也满足了懒加载
     * <p>原理: 使用同步锁 synchronized 锁住 创建单例的方法 ，防止多个线程同时调用，从而避免造成单例被多次创建</p>
     *
     * <b>为什么是两次判断?</b>
     * <p>
     * 第一次判断singleton是否为null:
     * 第一次判断是在Synchronized同步代码块外进行判断，由于单例模式只会创建一个实例，
     * 并通过getInstance方法返回singleton对象，所以，第一次判断，是为了在singleton对象已经创建的情况下，
     * 避免进入同步代码块， 提升效率。
     * </p>
     * <p>
     * 第二次判断singleton是否为null:<br>
     * 第二次判断是为了避免以下情况的发生。<br>
     * <ul>
     *     <li>(1)假设：线程A已经经过第一次判断，判断singleton=null，准备进入同步代码块.</li>
     *     <li>(2)此时线程B获得时间片，由于线程A并没有创建实例，所以，判断singleton仍然=null，所以线程B创建了实例singleton。</li>
     *     <li>(3)此时，线程A再次获得时间片，由于刚刚经过第一次判断 singleton=null(不会重复判断)，进入同步代码块，这个时候，我们如果不加入第二次判断的话，
     *     那么线程A又会创建一个实例singleton，就不满足我们的单例模式的要求，</li>
     * </ul>
     * <p>
     * 所以第二次判断是很有必要的。
     * </p>
     *
     * @return INSTANCE
     */
    public static Singleton_05 getInstance() {
        //第一次判断,如果instance不为null,不进入抢锁阶段,直接返回实例
        if (INSTANCE == null) {
            synchronized (Singleton_05.class) {
                //抢到锁之后再次进行判断是否为null
                if (INSTANCE == null) {
                    /*
                     * 第一步是给singleton分配内存空间；
                     * 第二步开始调用 Singleton 的构造函数等，来初始化singleton；
                     * 第三步，将singleton对象指向分配的内存空间（执行完这步 singleton就不是null了）。
                     * 
                     * 注意: 如果是 1-3-2，那么在第3步执行完以后，singleton 就不是 null 了，可是这时 第 2 步并没有执行，
                     * singleton 对象未完成初始化，它的属性的值可能不是我们 所预期的值。假设此时线程 2 进入 getInstance 方法，
                     * 由于 singleton 已经不是 null 了，所以会通过第一重检查并直接返回，但其实这时的singleton并没有完成初始化，
                     * 所以使用这个实例的时候会报错(使用volatile防止指令重排为 1-3-2).
                     * */
                    INSTANCE = new Singleton_05();
                }
            }
        }
        return INSTANCE;
    }
}
