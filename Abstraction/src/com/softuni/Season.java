package com.softuni;

public class Season {
    private String name;
    private String[] months;
    private double averageTemperature;

    public Season(String name, double averageTemperature, String... months) {
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
}
