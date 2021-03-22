package com.design.pattern.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 10; i++){
            courseList.add(new Course());
        }
        System.out.println("Number of Courses is " + courseList.size());
    }
}
