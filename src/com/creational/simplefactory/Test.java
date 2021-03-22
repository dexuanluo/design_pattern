package com.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        VideoFactory vf = new VideoFactory();
        Video video = vf.getVideo("python");
        if (video == null){
            return;
        }
        video.produce();
    }
}
