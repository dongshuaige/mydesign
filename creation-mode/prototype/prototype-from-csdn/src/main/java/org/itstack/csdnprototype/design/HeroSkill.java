package org.itstack.csdnprototype.design;

/**
 * 体的原型类，被窃取技能的英雄
 */
public class HeroSkill implements Cloneable {
    /**
     * 英雄名称
     */
    private String name;

    /**
     * 技能名称
     */
    private String bigMove;

    public HeroSkill() {
    }

    public HeroSkill(String name, String bigMove) {
        this.name = name;
        this.bigMove = bigMove;
    }

    @Override
    public HeroSkill clone() {
        HeroSkill clone = null;
        try {
            clone = (HeroSkill) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("塞拉斯窃取" + name + "的大招:" + bigMove);
        return clone;
    }

    /**
     * 英雄的大招展示
     */
    public void showSkill() {
        System.out.println(name + "的大招:" + bigMove);
    }
}
