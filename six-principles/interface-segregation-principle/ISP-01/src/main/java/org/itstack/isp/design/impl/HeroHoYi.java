package org.itstack.isp.design.impl;

import org.itstack.isp.design.ISkillArchery;
import org.itstack.isp.design.ISkillSilent;
import org.itstack.isp.design.ISkillVertigo;

/**
 * 后羿
 */
public class HeroHoYi implements ISkillArchery, ISkillSilent, ISkillVertigo {
    @Override
    public void doArchery() {
        System.out.println("后羿的灼日之矢");
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
