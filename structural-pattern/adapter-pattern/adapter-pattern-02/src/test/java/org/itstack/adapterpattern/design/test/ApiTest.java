package org.itstack.adapterpattern.design.test;

import com.alibaba.fastjson.JSON;
import org.itstack.adapterpattern.design.MQAdapter;
import org.itstack.adapterpattern.design.OrderAdapterService;
import org.itstack.adapterpattern.design.RebateInfo;
import org.itstack.adapterpattern.design.cuisine.impl.InsideOrderService;
import org.itstack.adapterpattern.design.cuisine.impl.POPOrderAdapterServiceImpl;
import org.itstack.adapterpattern.design.mq.CreateAccount;
import org.itstack.adapterpattern.design.mq.OrderMq;
import org.itstack.adapterpattern.design.mq.POPOrderDelivered;
import org.itstack.adapterpattern.design.user.IUserInfo;
import org.itstack.adapterpattern.design.user.impl.UserInfo;
import org.itstack.adapterpattern.design.user.more.IOuterUserBaseInfo;
import org.itstack.adapterpattern.design.user.more.IOuterUserHomeInfo;
import org.itstack.adapterpattern.design.user.more.IOuterUserOfficeInfo;
import org.itstack.adapterpattern.design.user.more.impl.MoreInterfacesOuterUserInfo;
import org.itstack.adapterpattern.design.user.more.impl.OutUserBaseInfo;
import org.itstack.adapterpattern.design.user.more.impl.OuterUserHomeInfo;
import org.itstack.adapterpattern.design.user.more.impl.OuterUserOfficeInfo;
import org.itstack.adapterpattern.design.user.single.impl.OuterUserInfo;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ApiTest {

    @Test
    public void test_MQAdapter() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sf.parse("2020-06-01 23:20:16");
        CreateAccount create_account = new CreateAccount();
        create_account.setNumber("100001");
        create_account.setAddress("上海市.闵行区.复旦大学");
        create_account.setAccountDate(parse);
        create_account.setDesc("在校开户");

        Map<String, String> link01 = new HashMap<>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(create_account.toString(), link01);
        System.out.println("mq.create_account(适配前)" + create_account);
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));

        System.out.println("===============================================================\r\n");
        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(parse);

        HashMap<String, String> link02 = new HashMap<String, String>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MQAdapter.filter(orderMq.toString(), link02);
        System.out.println("mq.orderMq(适配前)" + orderMq);
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));

        System.out.println("===============================================================\r\n");

        POPOrderDelivered popOrderMq = new POPOrderDelivered();
        popOrderMq.setuId("100002");
        popOrderMq.setSku(new Date());
        popOrderMq.setOrderId("10928092093111124");
        popOrderMq.setOrderTime(parse);


        HashMap<String, String> link03 = new HashMap<String, String>();
        link03.put("userId", "uId");
        link03.put("bizId", "orderId");
        link03.put("bizTime", "orderTime");
        link03.put("desc", "sku");
        RebateInfo rebateInfo03 = MQAdapter.filter(popOrderMq.toString(), link03);
        System.out.println("mq.orderMq(适配前)" + popOrderMq);
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo03));
    }

    @Test
    public void test_itfAdapter() {
        OrderAdapterService popOrderAdapterService = new POPOrderAdapterServiceImpl();
        System.out.println("判断首单，接口适配(POP)：" + popOrderAdapterService.isFirst("100001"));

        OrderAdapterService insideOrderService = new InsideOrderService();
        System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("100001"));
    }

    /**
     * 单接口适配
     */
    @Test
    public void test_singleItfAdapter() {
        // IUserInfo userInfo = new UserInfo();
        // 适配器后只需要修改实现类即可
        IUserInfo userInfo = new OuterUserInfo();
        userInfo.getUserName();
    }
    
    @Test
    public void test_moreItfAdapter(){
        IOuterUserBaseInfo baseInfo = new OutUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        MoreInterfacesOuterUserInfo adapter = new MoreInterfacesOuterUserInfo();
        adapter.setBaseInfo(baseInfo);
        adapter.setHomeInfo(homeInfo);
        adapter.setOfficeInfo(officeInfo);
        // 外包人员的信息
        System.out.println("******************外包人员信息*****************************\r\n");
        adapter.getUserName();
        adapter.getMobileNumber();
        adapter.getHomeAddress();
        adapter.getHomeTelNumber();
        adapter.getOccupation();
        adapter.getOfficeTelNumber();
        // 内部人员的信息
        System.out.println("******************内部人员的信息*****************************\r\n");
        IUserInfo adapter1 = new UserInfo();
        adapter1.getUserName();
        adapter1.getMobileNumber();
        adapter1.getHomeAddress();
        adapter1.getHomeTelNumber();
        adapter1.getOccupation();
        adapter1.getOfficeTelNumber();
    }
}
