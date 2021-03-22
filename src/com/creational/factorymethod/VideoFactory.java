package com.creational.factorymethod;

public abstract class VideoFactory {
    public abstract Video getVideo();
//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        }
//        if ("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }


}

