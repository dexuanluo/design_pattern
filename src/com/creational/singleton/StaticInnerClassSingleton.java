package com.creational.singleton;

public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton inner = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.inner;
    }
}
