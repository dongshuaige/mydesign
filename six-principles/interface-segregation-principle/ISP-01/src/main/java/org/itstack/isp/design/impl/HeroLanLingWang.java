package org.itstack.isp.design.impl;

import org.itstack.isp.design.ISKillInvisible;
import org.itstack.isp.design.ISkillSilent;
import org.itstack.isp.design.ISkillVertigo;

/**
 * 兰陵王
 */
public class HeroLanLingWang implements ISKillInvisible, ISkillSilent, ISkillVertigo {
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
