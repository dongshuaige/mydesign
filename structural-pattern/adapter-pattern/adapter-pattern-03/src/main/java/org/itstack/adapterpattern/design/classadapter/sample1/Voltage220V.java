package org.itstack.adapterpattern.design.classadapter.sample1;

/**
 * 被适配的类
 *【优缺点】
 * 【优点】
 * 由于其继承了src类，所以它可以根据需求重写src类的方法，使得Adapter的灵活性增强了
 * 【缺点】
 * Java是单继承机制，所以类适配器需要继承src类这一点算是一个缺点（之前的七大原则分析过，使用继承不好），因为这要求dst必须是接口，有一定局限性
 * src类的方法在Adapter中都会暴露出来，也增加了使用的成本（如果方法很多，调用起来就麻烦了）
 */
public class Voltage220V {
    /**
     * 输出220V的电压
     *
     * @return src
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
