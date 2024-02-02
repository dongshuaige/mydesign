package org.itstack.srp.design.impl;

import org.itstack.srp.design.IVideoUserService;

/**
 * 访客用户服务实现
 */
public class VipVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("VIP用户,视频1080P蓝光");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP用户,视频无广告");
    }
}
