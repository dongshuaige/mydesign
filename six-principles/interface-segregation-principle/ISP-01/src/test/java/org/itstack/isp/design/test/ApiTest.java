package org.itstack.isp.design.test;

import org.itstack.isp.design.impl.HeroHoYi;
import org.itstack.isp.design.impl.HeroLanLingWang;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test_ISkill(){
        // 后裔
        HeroHoYi heroHouYi = new HeroHoYi();
        heroHouYi.doArchery();

        HeroLanLingWang heroLanLingWang = new HeroLanLingWang();
        heroLanLingWang.doInvisible();
    }
}
