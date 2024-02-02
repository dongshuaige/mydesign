package org.itstack.srp.design.test;

import org.itstack.srp.design.VideoUserService;

public class ApiTest {
    public static void main(String[] args) {
        VideoUserService videoUserService = new VideoUserService();
        videoUserService.serveGrade("访客用户");
        videoUserService.serveGrade("普通用户");
        videoUserService.serveGrade("VIP用户");
    }
}
