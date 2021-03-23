package com.creational.singleton;

public class T implements Runnable{
    @Override
    public void run(){
        LazyDoubleCheckSingleton ls = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName());
    }
}
