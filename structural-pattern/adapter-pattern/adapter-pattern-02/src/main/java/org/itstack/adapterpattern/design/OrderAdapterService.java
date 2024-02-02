package org.itstack.adapterpattern.design;

/**
 * 统一适配接口
 */
public interface OrderAdapterService {
    /**
     * 是否首单
     * @param uId 用户Id
     * @return true or false
     */
    boolean isFirst(String uId);
}
