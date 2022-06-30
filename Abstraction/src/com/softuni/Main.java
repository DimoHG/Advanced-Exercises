package com.softuni;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Person person = new Person("Ivan", "Georgiev");
        System.out.println(person.getName());

        Person person2 = new Person("Petar", "Dimitrov");
        System.out.println(person2.getName());

        Person.jump();
    }

}
