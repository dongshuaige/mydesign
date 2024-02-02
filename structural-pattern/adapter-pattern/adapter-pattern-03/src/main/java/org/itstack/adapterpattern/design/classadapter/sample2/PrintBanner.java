package org.itstack.adapterpattern.design.classadapter.sample2;

/**
 * 适配器
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String desc) {
        super(desc);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
