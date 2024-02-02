package org.itstack.adapterpattern.design.springmvc.adapter;

import org.itstack.adapterpattern.design.springmvc.contr.AnnotationController;

public class AnnotationHandleAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }
}
