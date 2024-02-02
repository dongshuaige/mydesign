package org.itstack.standardbuilder.design;

public class Director {
    private Builder builder;
    
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组装自行车的方法
     */
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
