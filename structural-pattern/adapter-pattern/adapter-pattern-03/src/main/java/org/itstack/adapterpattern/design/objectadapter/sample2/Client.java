package org.itstack.adapterpattern.design.objectadapter.sample2;

public class Client {
    public static void main(String[] args) {
        PrintBanner banner = new PrintBanner("Hello");
        banner.printWeak();
        banner.printStrong();
    }
}
