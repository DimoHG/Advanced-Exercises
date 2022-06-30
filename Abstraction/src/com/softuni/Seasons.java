package com.softuni;

import java.util.Arrays;

public enum Seasons {
    SUMMER("Summer", 25, "July", "August"),
    WINTER("Winter", 5, "December", "January"),
    SPRING("Spring", 12, "April", "May"),
    AUTUMN("Autumn", 12, "September", "October");

    private String name;
    private String[] months;
    private double averageTemperature;

    Seasons(String name, double averageTemperature, String... months) {
        this.name = name;
        this.months = months;
        this.averageTemperature = averageTemperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getMonths() {
        return months;
    }

    public void setMonths(String[] months) {
        this.months = months;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    @Override
    public String toString() {
        return String.format("The name of the month is %s and the average temperature is %.2f", getName(), getAverageTemperature());
    }
}
