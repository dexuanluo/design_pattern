package com.design.pattern.openclose;

public class JavaCourse implements Course{
    private int id;
    private String name;
    private Double price;

    public JavaCourse(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    };
    public String getName(){
        return this.name;
    };
    public Double getPrice(){
        return this.price;
    };
}
