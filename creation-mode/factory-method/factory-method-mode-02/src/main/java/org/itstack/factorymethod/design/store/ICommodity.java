package org.itstack.factorymethod.design.store;

import java.util.Map;

public interface ICommodity {
    /**
     * 发奖
     *
     * @param uId 用户Id
     * @param commodityId 奖品Id
     * @param bizId 业务Id
     * @param extMap 扩展字段
     * @throws Exception e
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
