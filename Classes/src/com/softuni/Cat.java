package com.softuni;

public class Cat {
    private String name;
    private int age;
    private String color;
    private String favouriteToy;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String color){
        this(name, age);
        this.color = color;
    }

    public Cat(String name, int age, String color, String favouriteToy){
        this(name, age, color);
        this.color = color;
    }

    public void meow(){
        System.out.println("Meow " + this.name);
    }

    public static void saySomething(){
        System.out.println("Something");
    }

    //set
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can't be less than 0");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return this.name + " " + this.age;
    }
}
