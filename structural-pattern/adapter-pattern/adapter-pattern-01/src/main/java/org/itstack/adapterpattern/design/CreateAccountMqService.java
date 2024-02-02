package org.itstack.adapterpattern.design;

import com.alibaba.fastjson.JSON;
import org.itstack.adapterpattern.design.mq.CreateAccount;

/**
 * MQ接收消息实现
 */
public class CreateAccountMqService {
    public void onMessage(String message){
        CreateAccount mq = JSON.parseObject(message, CreateAccount.class);
        System.out.println(mq.getNumber());
        System.out.println(mq.getAddress());
        System.out.println(mq.getAccountDate());
        // TODO 处理自己的业务
    }
}
