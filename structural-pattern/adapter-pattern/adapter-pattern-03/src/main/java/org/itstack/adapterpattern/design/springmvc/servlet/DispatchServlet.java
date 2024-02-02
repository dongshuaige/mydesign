package org.itstack.adapterpattern.design.springmvc.servlet;

import org.itstack.adapterpattern.design.springmvc.adapter.AnnotationHandleAdapter;
import org.itstack.adapterpattern.design.springmvc.adapter.HandlerAdapter;
import org.itstack.adapterpattern.design.springmvc.adapter.HttpHandleAdapter;
import org.itstack.adapterpattern.design.springmvc.adapter.SimpleHandlerAdapter;
import org.itstack.adapterpattern.design.springmvc.contr.Controller;
import org.itstack.adapterpattern.design.springmvc.contr.HttpController;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
    /**
     * 组合所有适配器
     */
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandleAdapter());
        handlerAdapters.add(new HttpHandleAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
        // 此处模拟SpringMvc从request取handler的对象
        // 适配器可以获取到希望的controller
        HttpController controller = new HttpController();
        // AnnotationController controller = new AnnotationController();
        //SimpleController controller = new SimpleController();
        //得到对应适配器
        HandlerAdapter adapter = getHandler(controller);
        // 通过适配器执行对应的controller对应方法
        adapter.handle(controller);
    }

    /**
     * 根据controller返回对应的适配器
     *
     * @param controller
     * @return
     */
    public HandlerAdapter getHandler(Controller controller) {
        // 遍历:根据得到的controller(handler),返回对应的适配器
        for (HandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();// http...
    }
}
