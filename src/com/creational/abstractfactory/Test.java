package com.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory fv = new PythonCourseFactory();
        Video video = fv.getVideo();
        Article article = fv.getArticle();
        video.produce();
        article.produce();
    }
}
