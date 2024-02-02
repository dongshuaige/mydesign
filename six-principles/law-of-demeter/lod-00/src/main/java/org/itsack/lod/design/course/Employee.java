package org.itsack.lod.design.course;

import java.util.List;

/**
 * 员工
 */
public class Employee {
    public void checkNumberOfCourses(List<Course> courseList) {
        System.out.println("目前已发布的课程数量是:"+courseList.size());
    }
}
