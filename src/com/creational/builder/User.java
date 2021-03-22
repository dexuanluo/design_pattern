package com.creational.builder;

public class User {
    private CourseBuilderKernel courseBuilder;
    public void setCourseBuilder(CourseBuilderKernel courseBuilder){
        this.courseBuilder = courseBuilder;
    }

    public Course produceCourse(String courseName, String coursePPT,
                                String courseVideo, String courseQA){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
