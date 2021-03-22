package com.design.pattern.dependence_inversion;

public class Test {
//Bad
//Depending on the implementation of Robot Class
//    public static void main(String[] args) {
//        Robot robot = new Robot();
//        robot.studyJavaCourse();
//        robot.studyPythonCourse();
//    }
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.study(new JavaCourse());
        robot.study(new PythonCourse());
    }
}
