package org.itstack.builderpattern.design;

public interface IMenu {
    /**
     * 吊顶
     */
    IMenu appendCeil(Matter matter);

    /**
     * 涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 清单明细
     */
    String getDetail();
}
