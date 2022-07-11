package birthDates;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> creatures = new ArrayList<>();

        while (!"End".equals(input)) {
            String[] inputParts = input.split(" ");
            String typeToCreate = inputParts[0];
            switch (typeToCreate) {
                case "Citizen":
                    String citizenName = inputParts[1];
                    int age = Integer.parseInt(inputParts[2]);
                    String id = inputParts[3];
                    String citizenBirthDate = inputParts[4];
                    Birthable citizen = new Citizen(citizenName, age, id, citizenBirthDate);
                    creatures.add(citizen);
                    break;
                case "Pet":
                    String petName = inputParts[1];
                    String birthDate = inputParts[2];
                    Birthable pet = new Pet(petName, birthDate);
                    creatures.add(pet);
                    break;
                case "Robot":
                    //ToDo: Create Robots!!!
                    break;
            }
            input = scanner.nextLine();
        }
        String year = scanner.nextLine();

        for (Birthable birthable : creatures) {
            if(birthable.getBirthDate().endsWith(year)){
                System.out.println(birthable.getBirthDate());
            }
        }

    }


}
