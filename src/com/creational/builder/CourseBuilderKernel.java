package com.creational.builder;

public abstract class CourseBuilderKernel {
//    private String courseName;
//    private String coursePPT;
//    private String courseVideo;
//    private String qA;
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String ppt);
    public abstract void buildCourseVideo(String video);
    public abstract void buildCourseQA(String qA);
    public abstract Course makeCourse();

}
