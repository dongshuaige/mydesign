package org.itstack.isp.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 抽奖控制
 */
public class DrawControl {

    private IDraw draw;

    /**
     * 抽奖
     */
    public List<BetUser> doDraw(IDraw draw, List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }

}
