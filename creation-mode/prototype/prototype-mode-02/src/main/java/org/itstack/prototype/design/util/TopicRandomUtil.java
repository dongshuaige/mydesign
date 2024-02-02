package org.itstack.prototype.design.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 针对每一个试卷都会使用克隆的方式进行复制,复制完成后将试卷的题目以及每个题目的答案进行乱序处理
 */
public class TopicRandomUtil {
    /**
     * 乱序Map元素,记录对应答案key
     *
     * @param option 题目
     * @param key    答案
     * @return 乱序后(A = c, B = d, C = a, D = b)
     */
    public static Topic random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        // 打乱原有选项的顺序
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<>();
        int idx = 0;
        String keyNew = "";
        // 遍历原选项
        for(String next: keySet){
            // 打乱后的答案
            String randomKey = keyList.get(idx++);
            if(key.equals(next)){
                // 记录打乱顺序后的正确答案
                keyNew = randomKey;
            }
            // 打乱后的选项及对应的答案
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }
}
