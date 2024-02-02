package org.itstack.isp.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 随机抽奖
 */
public class DrawRandom implements IDraw {

    @Override
    public List<BetUser> prize(List<BetUser> list, int count) {
        // 集合数量很小,直接返回
        if (list.size() < count) return list;

        // 乱序集合
        Collections.shuffle(list);
        // 取出指定数量的中奖用户
        List<BetUser> prizeList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            prizeList.add(list.get(i));
        }
        return prizeList;
    }
}
