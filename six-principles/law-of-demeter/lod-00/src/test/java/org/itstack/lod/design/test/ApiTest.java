package org.itstack.lod.design.test;

import com.alibaba.fastjson.JSON;
import org.itsack.lod.design.course.Employee;
import org.itsack.lod.design.course.TeamLeader;
import org.itsack.lod.design.school.Principal;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 测试
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_Principal() {
        Principal principal = new Principal();
        Map<String, Object> map = principal.queryClazzInfo("3年1班");
        logger.info("查询结果：{}", JSON.toJSONString(map));
    }

    @Test
    public void test_course() {
        TeamLeader teamLeader = new TeamLeader();
        Employee employee = new Employee();
        teamLeader.commandCheckNumber(employee);
    }
}
