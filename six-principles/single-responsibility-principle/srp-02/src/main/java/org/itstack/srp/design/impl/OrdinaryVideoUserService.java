package org.itstack.srp.design.impl;

import org.itstack.srp.design.IVideoUserService;

/**
 * 普通用户服务实现
 */
public class OrdinaryVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("普通用户,视频720P超清");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户,视频有广告");
    }
}
