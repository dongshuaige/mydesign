package org.itstack.adapterpattern.design.interfaceadapter.sample1;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            /**
             * 只需要去覆盖我们 需要使用 接口方法
             */
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        absAdapter.m1();
    }
}
