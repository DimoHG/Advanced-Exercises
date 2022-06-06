package com.softuni.speedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double consumption;
    private int distance;

    public Car(String model, double fuelAmount, double consumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumption = consumption;
        this.distance = 0;
    }

    public boolean hasEnoughFuel(int kilometers){
        double fuelNeeded = calculateNeededFuel(kilometers);
        return fuelAmount >= fuelNeeded;
    }

    public void drive(int kilometers){
        double fuelNeeded = calculateNeededFuel(kilometers);
        fuelAmount-=fuelNeeded;
        distance+=kilometers;
    }

    public double calculateNeededFuel(int kilometers){
        return kilometers * consumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String toString(){
//        /Ferrari-488Spider 4.41 97
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distance);
    }
}
