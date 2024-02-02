package org.itstack.standardbuilder.design;

public class Client {
    public static void main(String[] args) {
//        // 创建指挥者对象
//        Director director = new Director(new MoBikeBuilder());
//        // 指挥者组装车
//        Bike moBike = director.construct();
//        System.out.println(moBike.getFrame());
//        System.out.println(moBike.getSeat());
//
//        Director haluoBikeDirector = new Director(new HaluoBuilder());
//        Bike haluoBike = haluoBikeDirector.construct();
//        System.out.println(haluoBike.getFrame());
//        System.out.println(haluoBike.getSeat());

        //创建手机对象  通过构建者对象获取手机对象
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .build();
        System.out.println(phone);
    }
}
