package com.design.pattern.liskov;

public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("Width: " + rectangle.getWidth() + " Length: " + rectangle.getLength());
        }

        System.out.println("Completed Width: " + rectangle.getWidth() + " Length: " + rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setLength(10);
        resize(rectangle);
    }

    //Infinite loop Bad!!!
//public static void main(String[] args) {
//    Rectangle rectangle = new Square();
//    rectangle.setWidth(5);
//    rectangle.setLength(10);
//    resize(rectangle);
//}
}
