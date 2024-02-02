package org.itstack.adapterpattern.design.springmvc.adapter;

import org.itstack.adapterpattern.design.springmvc.contr.SimpleController;

public class SimpleHandlerAdapter implements HandlerAdapter {
    
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimplerHandler();
    }
}
