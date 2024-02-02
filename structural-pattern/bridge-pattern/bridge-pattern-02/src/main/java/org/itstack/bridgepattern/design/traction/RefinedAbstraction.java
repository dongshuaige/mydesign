package org.itstack.bridgepattern.design.traction;

/**
 * 修正抽象RefinedAbstraction
 */
public class RefinedAbstraction extends AbsTraction {
    public RefinedAbstraction(IImplementor iImplementor) {
        super(iImplementor);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("refined operation");
    }
}
