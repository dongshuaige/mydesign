package org.itstack.builderpattern.design.test;

import org.itstack.builderpattern.design.Builder;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test_builder() {
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(135.52D).getDetail());
        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
