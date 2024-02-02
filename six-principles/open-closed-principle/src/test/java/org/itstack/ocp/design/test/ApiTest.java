package org.itstack.ocp.design.test;

import org.itstack.ocp.design.ICalculationArea;
import org.itstack.ocp.design.impl.CalculationAreaExt;
import org.junit.Test;

/**
 * 开闭原则功能测试
 */
public class ApiTest {
    @Test
    public void test_calculateArea() {
        ICalculationArea calculationArea = new CalculationAreaExt();
        double area = calculationArea.circular(10);
        System.out.println(area);
    }
}
