package com.softuni.speedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carsCount = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        for (int i = 0; i < carsCount; i++) {
            String[] input = scanner.nextLine().split(" ");

            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double consumption = Double.parseDouble(input[2]);

            Car car = new Car(model, fuelAmount, consumption);
            cars.put(model, car);
        }

        String input = scanner.nextLine();
        while(!input.equals("End")){
            String[] commandParts = input.split(" ");

            String model = commandParts[1];
            int kilometers = Integer.parseInt(commandParts[2]);

            Car currentCar = cars.get(model);
            if(!currentCar.hasEnoughFuel(kilometers)){
                System.out.println("Insufficient fuel for the drive");
            } else{
                currentCar.drive(kilometers);
            }
            input = scanner.nextLine();
        }

        cars.values().stream().forEach(System.out::println);
    }
}
