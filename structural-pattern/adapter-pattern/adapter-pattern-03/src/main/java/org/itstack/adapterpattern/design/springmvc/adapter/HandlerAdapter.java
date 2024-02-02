package org.itstack.adapterpattern.design.springmvc.adapter;

/**
 * 定义一个Adapter接口
 */
public interface HandlerAdapter {
    /**
     * 判断是否支持该Handle
     */
    boolean supports(Object handler);

    /**
     * 调用
     * @param handler
     */
    void handle(Object handler);
}
