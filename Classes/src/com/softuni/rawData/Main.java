package com.softuni.rawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfCars = Integer.parseInt(scanner.nextLine());
//{Model} {EngineSpeed} {EnginePower} {CargoWeight} {CargoType}
// {Tire1Pressure} {Tire1Age}
// {Tire2Pressure} {Tire2Age}
// {Tire3Pressure} {Tire3Age}
// {Tire4Pressure} {Tire4Age}"
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < countOfCars; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String carModel = tokens[0];

            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j < tokens.length; j = j + 2) {
                double tirePressure = Double.parseDouble(tokens[j]);
                int tireAge = Integer.parseInt(tokens[j + 1]);
                Tire tire = new Tire(tirePressure, tireAge);
                tires.add(tire);
            }

            Car car = new Car(carModel, engine, cargo, tires);
            cars.add(car);
        }

        String cargoType = scanner.nextLine();
        if(cargoType.equals("fragile")){
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals("fragile"))
                    .filter(car -> car.getTires().stream().anyMatch(tire -> tire.getPressure() < 1))
                    .forEach(car -> System.out.println(car.getModel()));
        }else {
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals("flamable"))
                    .filter(car -> car.getEngine().getPower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}