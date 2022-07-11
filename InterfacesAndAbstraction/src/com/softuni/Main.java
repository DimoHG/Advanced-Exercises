package com.softuni;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cow cow = new Cow();
        Cow cow1 = new Cow();
        Goat goat = new Goat();
        Goat goat1 = new Goat();

        List<Walkable> animals = new ArrayList<>();
        animals.add(goat);
        animals.add(goat1);
        for (Walkable animal : animals) {
            animal.walk();
        }


        List<Cow> cows = new ArrayList<>();
        cows.add(cow);
        cows.add(cow1);

        List<Goat> goats = new ArrayList<>();
        goats.add(goat);
        goats.add(goat1);

        for (Cow currentCow : cows) {
            currentCow.walk();
        }

        for (Goat currentGoat : goats) {
            currentGoat.walk();
        }


    }
}
