package org.itstack.adapterpattern.design.user.single;

import java.util.Map;

/**
 * 外包人员接口(即待接入的接口数据)
 */
public interface IOuterUser {
    /**
     * 基本信息
     */
    Map<String,Object> getUserBaseInfo();

    /**
     * 工作区域信息
     */
    Map<String,Object> getUserOfficeInfo();

    /**
     * 用户的家庭信息
     */
    Map<String,Object> getUserHomeInfo();
}
