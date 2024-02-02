package org.itstack.adapterpattern.design.springmvc.adapter;

import org.itstack.adapterpattern.design.springmvc.contr.HttpController;

public class HttpHandleAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }
}
