package org.itstack.csdnprototype.design;

public class TestPrototype {
    public static void main(String[] args) {
        // 初始化英雄
        HeroSkill heroSkill = new HeroSkill("盲僧", "神龙摆尾");
        // 初始化英雄工厂
        StealManyFactory stealManyFactory = new StealManyFactory(heroSkill);
        // 复制英雄技能
        HeroSkill cloneHeroSkill = stealManyFactory.cloneHeroSkill();
        // 塞拉斯复制的技能
        cloneHeroSkill.showSkill();
        System.out.println("-------下方原英雄技能展示----------");
        heroSkill.showSkill();
    }
}
