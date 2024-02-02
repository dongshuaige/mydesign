package org.itstack.ocp.design;

/**
 * 面积计算接口
 */
public interface ICalculationArea {
    /**
     * 计算长方形面积
     * @param l 长
     * @param w 宽
     * @return area 
     */
    double rectangle(double l, double w);

    /**
     * 计算三角形面积
     * @param x 边长
     * @param y 边长
     * @param z 边长
     * @return area
     * 海伦公式：S=√[p(p-a)(p-b)(p-c)] 其中：p=(a+b+c)/2
     */
    double triangle(double x, double y, double z);

    /**
     * 计算圆形面积
     * @param r 半径
     * @return 面积
     * π*r*r
     */
    double circular(double r);
}
