package org.itstack.builderpattern.design;

import org.itstack.builderpattern.design.ceiling.LevelOneCeiling;
import org.itstack.builderpattern.design.ceiling.LevelTwoCeiling;
import org.itstack.builderpattern.design.coat.DuluxCoat;
import org.itstack.builderpattern.design.coat.LiBangCoat;
import org.itstack.builderpattern.design.floor.ShengXiangFloor;
import org.itstack.builderpattern.design.tile.DongPengTile;
import org.itstack.builderpattern.design.tile.MarcoPoloTile;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class DecorationPackageController {
    /**
     * 获取装修清单
     *
     * @param area  装修面积
     * @param level 装修等级
     * @return 装修清单
     */
    public String getMatterList(BigDecimal area, Integer level) {
        // 装修清单
        List<Matter> matterList = new ArrayList<>();
        // 装修价格
        BigDecimal price = BigDecimal.ZERO;
        // 欧式豪华
        if (level == 1) {
            // 吊顶:二级顶 涂料:多乐士 地板:圣象
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            DuluxCoat duluxCoat = new DuluxCoat();
            ShengXiangFloor shengXiangFloor = new ShengXiangFloor();
            matterList.add(levelTwoCeiling);
            matterList.add(duluxCoat);
            matterList.add(shengXiangFloor);
            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(duluxCoat.price()));
            price = price.add(area.multiply(shengXiangFloor.price()));
        }
        // 轻奢田园
        if (level == 2) {
            // 吊顶:二级顶 涂料:立邦 地砖:马可波罗
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();
            matterList.add(levelTwoCeiling);
            matterList.add(liBangCoat);
            matterList.add(marcoPoloTile);
            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));
        }

        // 现代简约
        if (level == 3) {
            // 吊顶:一级顶 涂料:立邦 地砖:东鹏
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            DongPengTile dongPengTile = new DongPengTile();
            matterList.add(levelOneCeiling);
            matterList.add(liBangCoat);
            matterList.add(dongPengTile);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelOneCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));
        }

        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + level + "\r\n" +
                "套餐价格：" + price.setScale(2, RoundingMode.HALF_UP) + " 元\r\n" +
                "房屋面积：" + area.doubleValue() + " 平米\r\n" +
                "材料清单：\r\n");

        for (Matter matter : matterList) {
            detail.append(matter.scene())
                    .append("：")
                    .append(matter.brand())
                    .append("、")
                    .append(matter.model())
                    .append("、平米价格：")
                    .append(matter.price())
                    .append(" 元。\n");
        }

        return detail.toString();
    }
}
