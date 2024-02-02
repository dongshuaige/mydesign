package org.itstack.adapterpattern.design.objectadapter.sample2;

import org.itstack.adapterpattern.design.classadapter.sample2.Banner;
import org.itstack.adapterpattern.design.objectadapter.sample2.dst.Print;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String desc) {
        this.banner = new Banner(desc);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
