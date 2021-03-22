package com.creational.builder;

public class CourseBuilder extends CourseBuilderKernel{
    private Course course = new Course();
    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String ppt) {
        course.setCoursePPT(ppt);
    }

    @Override
    public void buildCourseVideo(String video) {
        course.setCourseVideo(video);
    }

    @Override
    public void buildCourseQA(String qA) {
        course.setqA(qA);
    }

    @Override
    public Course makeCourse(){
        return course;
    }
}
