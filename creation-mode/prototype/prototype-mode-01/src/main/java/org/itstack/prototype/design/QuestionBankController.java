package org.itstack.prototype.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBankController {
    /**
     * 考试题库
     * TODO：没有实现的地方就是不能乱序，所有⼈的试卷顺序都是一样的。如果需要加乱序也是可以的，复杂度又会增加。
     *
     * @param candidate 考生
     * @param number    考号
     * @return 考试题库
     */
    public String createPaper(String candidate, String number) {

        // 创建选择题和问答题到集合中
        List<ChoiceQuestion> choiceQuestionList = new ArrayList<>();
        List<AnswerQuestion> answerQuestionList = new ArrayList<>();

        Map<String, String> map01 = new HashMap<>();
        map01.put("A", "JAVA2 EE");
        map01.put("B", "JAVA2 Card");
        map01.put("C", "JAVA2 ME");
        map01.put("D", "JAVA2 HE");
        map01.put("E", "JAVA2 SE");

        Map<String, String> map02 = new HashMap<>();
        map02.put("A", "JAVA程序的main方法必须写在类里面");
        map02.put("B", "JAVA程序中可以有多个main方法");
        map02.put("C", "JAVA程序中类名必须与文件名一样");
        map02.put("D", "JAVA程序的main方法中如果只有一条语句,可以不用{}(大括号)括起来");

        Map<String, String> map03 = new HashMap<>();
        map03.put("A", "变量由字母、下划线、数字、$符号随意组成;");
        map03.put("B", "变量名不能以数字作为开头;");
        map03.put("C", "A和a在java中是同一个变量;");
        map03.put("D", "不同类型的变量,可以起相同的名字;");

        Map<String, String> map04 = new HashMap<>();
        map04.put("A", "STRING");
        map04.put("B", "x3x;");
        map04.put("C", "void");
        map04.put("D", "de$f");

        Map<String, String> map05 = new HashMap<>();
        map05.put("A", "30");
        map05.put("B", "0");
        map05.put("C", "1");
        map05.put("D", "2");

        choiceQuestionList.add(new ChoiceQuestion("JAVA所定义的版本中不包括", map01, "D"));
        choiceQuestionList.add(new ChoiceQuestion("下列说法正确的是", map02, "A"));
        choiceQuestionList.add(new ChoiceQuestion("变量命名规范说法正确的是", map03, "B"));
        choiceQuestionList.add(new ChoiceQuestion("以下()不是合法的标识符", map04, "C"));
        choiceQuestionList.add(new ChoiceQuestion("表达式{11+3*8}/4%3的值是", map05, "D"));
        answerQuestionList.add(new AnswerQuestion("小红马和小黑马生的小马几条腿", "4条腿"));
        answerQuestionList.add(new AnswerQuestion("铁棒打头疼还是木棒打头疼", "头最疼"));
        answerQuestionList.add(new AnswerQuestion("为什么床不能睡觉", "牙床"));
        answerQuestionList.add(new AnswerQuestion("为什么好马不吃回头草", "后面的草没了"));

        //定义详情字符串包装结果
        // 输出结果
        StringBuilder details = new StringBuilder("考生：" + candidate + "\r\n"
                + "考号：" + number + "\r\n"
                + "----------------------------------------------------\r\n"
                + "一、选择题" + "\r\n\n");
        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            details.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                details.append(key).append("：").append(option.get(key)).append("\r\n");
            }
            details.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        details.append("二、问答题").append("\r\n\n");
        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            details.append("第").append(idx + 1).append("题：").append(answerQuestionList.get(idx).getName()).append("\r\n");
            details.append("答案：").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        // 返回结果内容。
        return details.toString();
    }
}