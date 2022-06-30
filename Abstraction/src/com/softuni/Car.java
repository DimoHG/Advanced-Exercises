package com.softuni;

public class Car {
    private String brand;
    private int age;
    private int speed;

    public Car(String brand, int age, int speed) {
        this.brand = brand;
        this.age = age;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static double convertKmToMiles(double km){
        return km * 0.621371;
    }
}
