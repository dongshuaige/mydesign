package org.itstack.srp.design.impl;

import org.itstack.srp.design.IVideoUserService;

/**
 * 访客用户服务实现
 */
public class GuestVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("访客用户,视频480P高清");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户,视频有广告");
    }
}
