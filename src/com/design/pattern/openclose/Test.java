package com.design.pattern.openclose;

public class Test {
    public static void main(String[] args){
        Course javaCourse = new JavaDiscountCourse(96, "apple", 99.999);
        System.out.println("id: " + javaCourse.getId() +" name: " + javaCourse.getName() + " price: " + javaCourse.getPrice());
    }
}
