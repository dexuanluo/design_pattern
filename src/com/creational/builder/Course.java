package com.creational.builder;

public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String qA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getqA() {
        return qA;
    }

    public void setqA(String qA) {
        this.qA = qA;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", qA='" + qA + '\'' +
                '}';
    }
}
