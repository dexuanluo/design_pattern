package com.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        VideoFactory vf = new PythonVideoFactory();
        Video video = vf.getVideo();
        video.produce();
    }
}
