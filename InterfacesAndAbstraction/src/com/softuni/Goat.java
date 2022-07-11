package com.softuni;

public class Goat implements Walkable, Eating {
    int dailyDoseOfMilk;

    public void walk() {
        System.out.println("Goat is walking");
    }

    @Override
    public void eat() {
        System.out.println("Eating milk");
    }
}
