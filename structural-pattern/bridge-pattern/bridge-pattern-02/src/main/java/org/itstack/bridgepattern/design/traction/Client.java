package org.itstack.bridgepattern.design.traction;

public class Client {
    public static void main(String[] args) {
        // 实现角色A
        IImplementor im = new ConcreteImplementorA();
        // 抽象角色，聚合实现
        AbsTraction absTraction = new RefinedAbstraction(im);
        // 执行操作
        absTraction.operation();
    }
}
