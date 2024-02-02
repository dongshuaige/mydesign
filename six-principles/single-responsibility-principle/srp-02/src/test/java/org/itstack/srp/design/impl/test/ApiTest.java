package org.itstack.srp.design.impl.test;

import org.itstack.srp.design.IVideoUserService;
import org.itstack.srp.design.impl.GuestVideoUserService;
import org.itstack.srp.design.impl.OrdinaryVideoUserService;
import org.itstack.srp.design.impl.VipVideoUserService;

public class ApiTest {
    public static void main(String[] args) {
        // 访客用户
        System.out.println("********访客用户************\r\n");
        IVideoUserService guestVideoUserService = new GuestVideoUserService();
        guestVideoUserService.definition();
        guestVideoUserService.advertisement();

        System.out.println("********普通用户************\r\n");
        IVideoUserService ordinaryVideoUserService = new OrdinaryVideoUserService();
        ordinaryVideoUserService.definition();
        ordinaryVideoUserService.advertisement();

        System.out.println("********VIP用户************\r\n");
        IVideoUserService vipVideoUserService = new VipVideoUserService();
        vipVideoUserService.definition();
        vipVideoUserService.advertisement();
        
        
    }
}
