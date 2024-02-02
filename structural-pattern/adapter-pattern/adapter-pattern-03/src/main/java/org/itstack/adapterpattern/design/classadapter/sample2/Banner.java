package org.itstack.adapterpattern.design.classadapter.sample2;

public class Banner {
    private String desc;

    public Banner(String desc) {
        this.desc = desc;
    }

    public void showWithParen() {
        System.out.println("(" + desc + ")");
    }

    public void showWithAster() {
        System.out.println("*" + desc + "*");
    }
}
