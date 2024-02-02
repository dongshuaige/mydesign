package org.itstack.isp.design;

/**
 * 王者英雄兰陵王技能
 */
public class HeroLanLingWang implements ISkill {
    @Override
    public void doArchery() {
        // 无此技能的实现
    }

    @Override
    public void doInvisible() {
        System.out.println("兰陵王的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("兰陵王的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("兰陵王的眩晕技能");
    }
}
