package org.itstack.builderpattern.design;

import org.itstack.builderpattern.design.ceiling.LevelOneCeiling;
import org.itstack.builderpattern.design.ceiling.LevelTwoCeiling;
import org.itstack.builderpattern.design.coat.DuluxCoat;
import org.itstack.builderpattern.design.coat.LiBangCoat;
import org.itstack.builderpattern.design.floor.ShengXiangFloor;
import org.itstack.builderpattern.design.tile.DongPengTile;
import org.itstack.builderpattern.design.tile.MarcoPoloTile;

public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeil(new LevelTwoCeiling()) //吊顶:二级顶
                .appendCoat(new DuluxCoat()) // 涂料:多乐士
                .appendFloor(new ShengXiangFloor()); // 地板:圣象
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeil(new LevelTwoCeiling()) // 吊顶:二级顶
                .appendCoat(new LiBangCoat()) // 涂料:立邦
                .appendTile(new MarcoPoloTile()); //地砖: 马可波罗瓷砖
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeil(new LevelOneCeiling()) // 吊顶:一级顶
                .appendCoat(new DuluxCoat()) // 涂料:多乐士
                .appendTile(new DongPengTile()); // 地砖:东鹏瓷砖
    }
}
