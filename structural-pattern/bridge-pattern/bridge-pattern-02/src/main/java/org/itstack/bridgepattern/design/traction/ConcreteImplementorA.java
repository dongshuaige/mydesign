package org.itstack.bridgepattern.design.traction;

/**
 * 具体实现角色
 */
public class ConcreteImplementorA implements IImplementor{
    @Override
    public void operationImpl() {
        System.out.println("I'm ConcreteImplementor A");
    }
}
