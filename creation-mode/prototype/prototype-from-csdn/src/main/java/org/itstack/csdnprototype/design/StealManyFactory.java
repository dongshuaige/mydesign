package org.itstack.csdnprototype.design;

/**
 * 工厂类，用于在客户端中复制对象
 * （塞拉斯，窃取别的英雄技能）
 */
public class StealManyFactory {
    private HeroSkill heroSkill;

    public StealManyFactory(HeroSkill heroSkill) {
        this.heroSkill = heroSkill;
    }

    public void setHeroSkill(HeroSkill heroSkill) {
        this.heroSkill = heroSkill;
    }

    public HeroSkill cloneHeroSkill() {
        return heroSkill.clone();
    }
}
