package org.itstack.adapterpattern.design.classadapter.sample2;

/**
 * 对Client的代码而言，Banner类、showWithParen方法和showWithAster 方法被完全隐藏起来了。
 * 这就好像笔记本电脑只要在直流12伏特电压下就能正常工作，但它并不知道这12伏特的电压是由适配器将100伏特交流电压转换而成的。
 * Client类并不知道PrintBanner类是如何实现的，这样就可以在不用对Client类进行修改的情况下改变PrintBanner类的具体实现。
 */
public class Client {
    public static void main(String[] args) {
        Print p = new PrintBanner("Sample");
        p.printWeak();
        p.printStrong();
    }
}
