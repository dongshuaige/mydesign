package org.itstack.standardbuilder.design;

public abstract class Builder {
    
    /**
     * 抽象的构建者
     *声明Bike类型的变量,并进行赋值
     */
    protected Bike bike=new Bike();

    /**
     * 构建车架
     */
    public abstract void buildFrame();

    /**
     * 制作车座
     */
    public abstract void buildSeat();

    /**
     * 
     * 制作自行车的方法
     * @return bike
     */
    public abstract Bike createBike();
}
