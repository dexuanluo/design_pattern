package com.design.pattern.single_responsibility;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.mainMove("bird");
        animal.mainMove("dog");
    }
}
