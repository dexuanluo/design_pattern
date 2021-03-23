package com.creational.singleton;

public class LazyDoubleCheckSingleton {
    public volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null; // prevent reordering memory allocation
    private LazyDoubleCheckSingleton(){}
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
            lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
        }
        return lazyDoubleCheckSingleton;
    }
}
