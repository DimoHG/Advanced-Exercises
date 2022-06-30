package com.softuni;

public class Person {
    public int publicVariable;
    private int age;
    private String name;
    private String EGN;

    public Person(String EGN, String name) {
        this.EGN = EGN;
        this.name = name;
    }

    public Person(String EGN, String name, int age) {
        this(EGN, name);
        this.age = age;
    }


    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    public String getEGN() {
        return EGN;
    }


}
