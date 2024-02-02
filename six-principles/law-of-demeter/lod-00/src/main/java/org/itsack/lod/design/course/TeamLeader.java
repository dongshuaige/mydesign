package org.itsack.lod.design.course;

import java.util.ArrayList;
import java.util.List;

/**
 * leader
 */
public class TeamLeader {
    public void commandCheckNumber(Employee employee){
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        employee.checkNumberOfCourses(courseList);
    }
}
