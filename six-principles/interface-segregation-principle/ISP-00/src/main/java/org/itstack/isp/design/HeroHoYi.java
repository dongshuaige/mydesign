package org.itstack.isp.design;

/**
 * 王者英雄后羿技能
 */
public class HeroHoYi implements ISkill{
    @Override
    public void doArchery() {
        System.out.println("后羿的灼日之矢");
    }

    @Override
    public void doInvisible() {
        // 无此技能的实现
    }

    @Override
    public void doSilent() {
        System.out.println("后羿的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("后羿的眩晕技能");
    }
}
