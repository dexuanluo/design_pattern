package com.design.pattern.dependence_inversion;

public class Robot {
    public void study(Course course){
        course.studyCourse();
    }
    //Bad implementation too specific
    public void studyJavaCourse(){
        System.out.println("Studying Java Course");
    }
    public void studyPythonCourse(){
        System.out.println("Studying Python Course");
    }
}
