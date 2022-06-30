package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutablePerson {
    private String name;
    private int age;
    private List<String> favouriteFruits;

    public ImmutablePerson(String name, int age, String... favouriteFoods) {
        this.name = name;
        this.age = age;
        this.favouriteFruits = new ArrayList<>(Arrays.asList(favouriteFoods));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getFavouriteFruits() {
        return Collections.unmodifiableList(this.favouriteFruits);
    }
}
