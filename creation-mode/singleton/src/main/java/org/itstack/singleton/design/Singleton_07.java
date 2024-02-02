package org.itstack.singleton.design;

/**
 * Effective Java作者推荐的枚举单例(线程安全)
 * <p>
 * 解决了最主要的；线程安全、自由串行化、单一实例。
 */
public enum Singleton_07 {
    INSTANCE;

    public void test() {
        System.out.println("hi~");
    }
}
