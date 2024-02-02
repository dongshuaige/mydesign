package org.itstack.isp.design;

import java.util.List;

/**
 * 抽奖接口
 */
public interface IDraw {
    List<BetUser> prize(List<BetUser> list, int count);
}
