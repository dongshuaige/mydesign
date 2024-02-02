package org.itstack.isp.design.test;

import org.itstack.isp.design.HeroHoYi;
import org.itstack.isp.design.HeroLanLingWang;
import org.junit.Test;

/**
 * 单元测试
 */
public class ApiTest {
    @Test
    public void test_ISkill(){
        // 后羿
        HeroHoYi houYi = new HeroHoYi();
        houYi.doArchery();

        HeroLanLingWang lanLingWang = new HeroLanLingWang();
        lanLingWang.doInvisible();
    }
}
