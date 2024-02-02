package org.itstack.prototype.design;

import org.itstack.prototype.design.util.Topic;
import org.itstack.prototype.design.util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * 核心题库类
 * 主要负责将各个的题目进行组装最终输出试卷
 */
public class QuestionBank implements Cloneable {
    /**
     * 考生名
     */
    private String candidate;

    /**
     * 考号
     */
    private String number;

    /**
     * 选择题集合
     */
    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<>();

    /**
     * 问答题集合
     */
    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<>();

    /**
     * 对选择题的添加
     */
    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    /**
     * 添加简答题
     */
    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    /**
     * clone方法 
     * 核心的操作: 对对象的复制,这里的复制不只是包括对象本身,也包括两个集合的复制
     * 只有这样的拷贝才能确保在操作克隆对象的时候不影响原对象。
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    @SuppressWarnings("unchecked")
    protected Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
        questionBank.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();
        // 题目乱序
        Collections.shuffle(questionBank.choiceQuestionList);
        Collections.shuffle(questionBank.answerQuestionList);
        // 答案乱序
        ArrayList<ChoiceQuestion> choiceQuestionList = questionBank.choiceQuestionList;
        for (ChoiceQuestion question : choiceQuestionList) {
            Topic random = TopicRandomUtil.random(question.getOption(), question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());
        }
        return questionBank;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
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
        // 返回结果内容
        return details.toString();
    }
}
