package org.itstack.dip.design.test;

import com.alibaba.fastjson.JSON;
import org.itstack.isp.design.BetUser;
import org.itstack.isp.design.DrawControl;
import org.itstack.isp.design.DrawRandom;
import org.itstack.isp.design.DrawWeightRank;
import org.itstack.isp.design.drivercar.ICar;
import org.itstack.isp.design.drivercar.IDriver;
import org.itstack.isp.design.drivercar.impl.Benz;
import org.itstack.isp.design.drivercar.impl.Bwm;
import org.itstack.isp.design.drivercar.impl.Driver;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 单元测试
 */
public class ApiTest {
    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_DrawControl() {
        List<BetUser> betUserList = new ArrayList<>();
        betUserList.add(new BetUser("花花", 65));
        betUserList.add(new BetUser("豆豆", 43));
        betUserList.add(new BetUser("小白", 72));
        betUserList.add(new BetUser("笨笨", 89));
        betUserList.add(new BetUser("丑蛋", 10));

        DrawControl drawControl = new DrawControl();
        List<BetUser> prizeRandomUserList = drawControl.doDraw(new DrawRandom(), betUserList, 3);
        logger.info("随机抽奖，中奖用户名单：{}", JSON.toJSON(prizeRandomUserList));

        List<BetUser> prizeWeightUserList = drawControl.doDraw(new DrawWeightRank(), betUserList, 4);
        logger.info("权重抽奖，中奖用户名单：{}", JSON.toJSON(prizeWeightUserList));
    }

    @Test
    public void test_driveCar() {
        IDriver xiaoli = new Driver();
        ICar benz = new Benz();
        ICar bmw = new Bwm();

        xiaoli.driver(benz);
        xiaoli.driver(bmw);
    }
}