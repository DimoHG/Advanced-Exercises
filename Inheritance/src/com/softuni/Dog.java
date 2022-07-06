package com.softuni;

public class Dog extends Animal {


    public Dog(int age) {
//        super();
        super(age, "Pesho");
    }


    public void jump() {
        System.out.println("Dog is jumping");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

}
