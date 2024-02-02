package org.itstack.adapterpattern.design;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * MQ消息适配器类
 */
public class MQAdapter {

    public static RebateInfo filter(String strJson, Map<String, String> link) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    /**
     * 把不同类型MQ中的各种属性,映射成我们需要的属性并返回
     * 把映射关系传递给Map<String, String> link,也就是准确描述了当前MQ中某个属性名称,映射为我们的某个属性名称,
     * 将接收到的json格式mq消息转换为Map结构.最后使用反射调用的方式给类型赋值
     *
     * @param obj  MQ属性
     * @param link link
     */
    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            RebateInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class).invoke(rebateInfo, val.toString());
        }
        return rebateInfo;
    }
}
