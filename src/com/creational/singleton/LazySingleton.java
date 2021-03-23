package com.creational.singleton;

public class LazySingleton {
    public static LazySingleton lazySingleton = null;
    private LazySingleton(){}
    public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
