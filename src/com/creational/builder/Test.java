package com.creational.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilderKernel cb = new CourseBuilder();
        User robot = new User();
        robot.setCourseBuilder(cb);
        Course course = robot.produceCourse("Python",
                "idiot",
                "porn",
                "no answer");
        System.out.println(course);
    }
}
