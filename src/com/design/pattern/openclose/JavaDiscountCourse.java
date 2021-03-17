package com.design.pattern.openclose;

public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(int id, String name, Double price) {
        super(id, name, price);
    }
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
    public Double getOriginPrice() {
        return super.getPrice();
    }
}
